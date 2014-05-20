/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greannetwork.agesws;

import com.novativa.www.ws.streamsterapi.Bar;
import com.novativa.www.ws.streamsterapi.Order;
import com.novativa.www.ws.streamsterapi.Position;
import com.novativa.www.ws.streamsterapi.Quote;
import com.novativa.www.ws.streamsterapi.StreamsterApiInterfaceProxy;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.MAType;
import com.tictactec.ta.lib.MInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author Grean
 */
public class JobTradeUpEURUSD implements Job {

    private static final Log log = LogFactory.getLog(JobTradeUpEURUSD.class.getName());
    
    private static boolean state = false;
    private static BigDecimal price = BigDecimal.ZERO;

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        Bar[] bars = getBar();

        List<BigDecimal> close = Arrays.asList(bars).stream().map(c -> c.getClose()).collect(Collectors.toList());
        List<BigDecimal> high = Arrays.asList(bars).stream().map(c -> c.getHigh()).collect(Collectors.toList());
        List<BigDecimal> low = Arrays.asList(bars).stream().map(c -> c.getLow()).collect(Collectors.toList());

        double[] closeArray = close.stream().mapToDouble(BigDecimal::doubleValue).toArray();
        double[] highArray = high.stream().mapToDouble(BigDecimal::doubleValue).toArray();
        double[] lowArray = low.stream().mapToDouble(BigDecimal::doubleValue).toArray();

        double[] macd = new double[close.size() - 33];
        double[] signal = new double[close.size() - 33];
        double[] histogram = new double[close.size() - 33];

        double[] ma50 = new double[close.size() - 49];
        double[] ema5 = new double[close.size() - 4];
        double[] ema100 = new double[close.size() - 99];
        double[] sar = new double[close.size() - 1];
        double[] slowK = new double[close.size() - 8];
        double[] slowD = new double[close.size() - 8];

        Core c = new Core();
        c.macd(0, close.size() - 1, closeArray, 12, 26, 9, new MInteger(), new MInteger(), macd, signal, histogram);
        c.sma(0, close.size() - 1, closeArray, 50, new MInteger(), new MInteger(), ma50);
        c.ema(0, close.size() - 1, closeArray, 5, new MInteger(), new MInteger(), ema5);
        c.ema(0, close.size() - 1, closeArray, 100, new MInteger(), new MInteger(), ema100);
        c.sar(0, close.size() - 1, highArray, lowArray, 0.02, 0.2, new MInteger(), new MInteger(), sar);
        c.stoch(0, close.size() - 1, highArray, lowArray, closeArray, 5, 3, MAType.Ema, 3, MAType.Ema, new MInteger(), new MInteger(), slowK, slowD);

        macd = shiftList(macd, close.size());
        signal = shiftList(signal, close.size());
        histogram = shiftList(histogram, close.size());
        ma50 = shiftList(ma50, close.size());
        ema5 = shiftList(ema5, close.size());
        ema100 = shiftList(ema100, close.size());
        sar = shiftList(sar, close.size());
        slowK = shiftList(slowK, close.size());
        slowD = shiftList(slowD, close.size());

        int i = close.size() - 1;

        boolean closePriceWithSMA50 = trackCut(closeArray, ma50, i, 5);
        boolean ema5WithSMA50 = trackCut(ema5, ma50, i, 5);
        boolean ema100Trend = trackTrend(ema100, i);
        boolean sarWithClosePrice = sar[i] < closeArray[i];
        boolean macdWithSignal = trackCut(macd, signal, i, 5);
        boolean macdHist = histogram[i] > 0;
        boolean stocha = trackCut(slowD, slowK, i, 2);
        
        // Check Position Status
        checkPosition();

        System.out.println(bars[i].getBarDateTime().getTime() + " " + closePriceWithSMA50 + " " + ema5WithSMA50 + " " + ema100Trend + " " + sarWithClosePrice + " " + macdWithSignal + " " + macdHist);

        int sum = booleanToInt(closePriceWithSMA50) + booleanToInt(ema5WithSMA50) + booleanToInt(ema100Trend) + booleanToInt(sarWithClosePrice) + booleanToInt(macdWithSignal) + booleanToInt(macdHist);

        BigDecimal subtract = bars[i].getClose().subtract(price);
        if (!state && sum >= 4) {
            
            // BUY IT!!!
            buy();
            
            log.info(i + " " + bars[i].getBarDateTime().getTime() + " BUY " + bars[i].getClose());
            price = bars[i].getClose();
            state = !state;
        } else if (state && stocha && subtract.compareTo(new BigDecimal(0.0001).setScale(4, RoundingMode.DOWN)) >= 0) {
            
            //Stop Position HERE!!!
            stopPosition();
            
            log.info(i + " " + bars[i].getBarDateTime().getTime() + " SELL " + bars[i].getClose() + " GET " + subtract);
            state = !state;
        }
    }

    private void buy() {
        Quote quote = getQuote();
        BigDecimal offer = quote.getOffer();
        Order o = new Order();
        o.setSide("BUY");
        o.setPriceType("Market");
        o.setInstrument("EUR/USD");
        o.setDesk("Virtual Forex");
        o.setDurationType("GTC");
        o.setQuantity(new BigDecimal(1));
        o.setExitStopLoss(offer.subtract(new BigDecimal(0.0010)));
        try {
            StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
            proxy.sendOrder(o);
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Quote getQuote() {
        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Quote quote = new Quote();
        try {
            quote = proxy.getQuote("EUR/USD");
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quote;
    }

    private void stopPosition() {
        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Position[] positions = new Position[0];
        try {
            positions = proxy.getPositions();
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Position position : positions) {
            if (position.getStatus().equalsIgnoreCase("OPEN")) {
                try {
                    proxy.closePosition(position.getPositionID());
                } catch (RemoteException ex) {
                    Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void checkPosition() {
        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Position[] positions = new Position[0];
        try {
            positions = proxy.getPositions();
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        state = false;
        for (Position position : positions) {
            if (position.getStatus().equalsIgnoreCase("OPEN")) {
                state = true;
            }
        }
    }

    public Bar[] getBar() {
        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Bar[] bars = new Bar[0];
        try {
            bars = proxy.getBars("EUR/USD", "5 Minutes", "f");
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUpGBPJPY.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bars;
    }

    private static boolean trackCut(double[] upper, double[] under, int position, int deep) {
        if (upper[position] <= under[position]) {
            return false;
        }
        for (int i = (position - 1); i > (position - deep); i--) {
            if (upper[i] < under[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean trackTrend(double[] real, int position) {
        if (real[position] < real[position - 1]) {
            return false;
        }
        for (int i = position; i >= 0; i--) {
            return real[i] > real[i - 1];
        }
        return false;
    }

    private static int booleanToInt(boolean value) {
        if (value) {
            return 1;
        } else {
            return 0;
        }
    }

    private static double[] shiftList(double[] datas, int total) {
        int shift = total - datas.length;
        double[] vals = new double[total];
        for (int i = 0; i < total; i++) {
            if (i < shift) {
                vals[i] = 0d;
            } else {
                vals[i] = datas[i - shift];
            }
        }
        return vals;
    }

}
