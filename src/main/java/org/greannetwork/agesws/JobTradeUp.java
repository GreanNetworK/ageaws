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
 * @author San
 */
public class JobTradeUp implements Job {

    private static final Log log = LogFactory.getLog(JobTradeUp.class.getName());
    public static boolean buyState = false;
    public static boolean sellState = false;
    public static BigDecimal price = BigDecimal.ZERO;

    public Bar[] getBar() {
        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Bar[] bars = new Bar[0];
        try {
            bars = proxy.getBars("EUR/USD", "5 Minutes", "f");
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bars;
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

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        Bar[] bars = getBar();
        List<BigDecimal> open = Arrays.asList(bars).stream().map(c -> c.getOpen()).collect(Collectors.toList());
        List<BigDecimal> close = Arrays.asList(bars).stream().map(c -> c.getClose()).collect(Collectors.toList());
        List<BigDecimal> high = Arrays.asList(bars).stream().map(c -> c.getHigh()).collect(Collectors.toList());
        List<BigDecimal> low = Arrays.asList(bars).stream().map(c -> c.getLow()).collect(Collectors.toList());

        double[] openArray = open.stream().mapToDouble(BigDecimal::doubleValue).toArray();
        double[] closeArray = close.stream().mapToDouble(BigDecimal::doubleValue).toArray();
        double[] highArray = high.stream().mapToDouble(BigDecimal::doubleValue).toArray();
        double[] lowArray = low.stream().mapToDouble(BigDecimal::doubleValue).toArray();

        double[] macd = new double[close.size() - 33];
        double[] signal = new double[close.size() - 33];
        double[] histogram = new double[close.size() - 33];

        double[] ema5 = new double[close.size() - 4];
        double[] ema20 = new double[close.size() - 19];
        double[] rsi = new double[close.size() - 14];
        double[] slowK = new double[close.size() - 8];
        double[] slowD = new double[close.size() - 8];

        Core c = new Core();
        c.macd(0, close.size() - 1, closeArray, 12, 26, 9, new MInteger(), new MInteger(), macd, signal, histogram);
        c.ema(0, close.size() - 1, closeArray, 5, new MInteger(), new MInteger(), ema5);
        c.ema(0, close.size() - 1, closeArray, 20, new MInteger(), new MInteger(), ema20);
        c.rsi(0, close.size() - 1, closeArray, 14, new MInteger(), new MInteger(), rsi);
        c.stoch(0, close.size() - 1, highArray, lowArray, closeArray, 5, 3, MAType.Ema, 3, MAType.Ema, new MInteger(), new MInteger(), slowK, slowD);

        macd = shiftList(macd, close.size());
        signal = shiftList(signal, close.size());
        histogram = shiftList(histogram, close.size());
        ema5 = shiftList(ema5, close.size());
        ema20 = shiftList(ema20, close.size());
        rsi = shiftList(rsi, close.size());
        slowK = shiftList(slowK, close.size());
        slowD = shiftList(slowD, close.size());

        int i = close.size() - 1;
        Integer[] result = new Integer[5];
        //MACD Indicator
        if (macd[i] >= signal[i] && macd[i - 1] < signal[i - 1] && histogram[i] > 0) {
            result[0] = 1;
        } else if (macd[i] <= signal[i] && macd[i - 1] > signal[i - 1] && histogram[i] < 0) {
            result[0] = -1;
        } else {
            result[0] = 0;
        }

        //LastMarket Indicator
        if (closeArray[i] > openArray[i] && closeArray[i - 1] > closeArray[i - 1]) {
            result[1] = 1;
        } else if (closeArray[i] < openArray[i] && closeArray[i - 1] < closeArray[i - 1]) {
            result[1] = -1;
        } else {
            result[1] = 0;
        }

        //Ema Indicator (Fast-Slow Period)
        if (ema20[i - 1] > ema5[i - 1] && ema20[i] <= ema5[i]) {
            result[2] = 1;
        } else if (ema20[i - 1] < ema5[i - 1] && ema20[i] >= ema5[i]) {
            result[2] = -1;
        } else {
            result[2] = 0;
        }

        //RSI Indicator
        if (rsi[i] >= 35 && rsi[i - 1] < 35) {
            result[3] = 1;
        } else if (rsi[i] <= 65 && rsi[i - 1] > 65) {
            result[3] = -1;
        } else {
            result[3] = 0;
        }

        //Stochastic
        if (slowK[i] >= slowD[i] && slowK[i - 1] < slowD[i - 1] && slowK[i] < 30) {
            result[4] = 1;
        } else if (slowK[i] <= slowD[i] && slowK[i - 1] > slowD[i - 1] && slowK[i] > 70) {
            result[4] = -1;
        } else {
            result[4] = 0;
        }

        stopPosition();
        clearPosition();

        Integer sum = result[0] + result[1] + result[2] + result[3] + result[4];
        if (!buyState && sum > 0) {
            System.out.println(">>>>> " + bars[i].getBarDateTime().getTime() + " BUY EUR/USD " + closeArray[i] + " => MACD[" + result[0] + "] LM[" + result[1] + "] EMA[" + result[2] + "] RSI[" + result[3] + "] STO[" + result[4] + "]");
            log.info(bars[i].getBarDateTime().getTime() + " BUY EUR/USD " + closeArray[i] + " => MACD[" + result[0] + "] LM[" + result[1] + "] EMA[" + result[2] + "] RSI[" + result[3] + "] STO[" + result[4] + "]");

            buy();

            buyState = !buyState;
        }
        if (!sellState && sum < 0) {
            System.out.println(">>>>> " + bars[i].getBarDateTime().getTime() + " SELL EUR/USD " + closeArray[i] + " => MACD[" + result[0] + "] LM[" + result[1] + "] EMA[" + result[2] + "] RSI[" + result[3] + "] STO[" + result[4] + "]");
            log.info(bars[i].getBarDateTime().getTime() + " SELL EUR/USD " + closeArray[i] + " => MACD[" + result[0] + "] LM[" + result[1] + "] EMA[" + result[2] + "] RSI[" + result[3] + "] STO[" + result[4] + "]");

            //sell();

            sellState = !sellState;
        } else {
            System.out.println(bars[i].getBarDateTime().getTime() + " NOTHING EUR/USD " + closeArray[i] + " => MACD[" + result[0] + "] LM[" + result[1] + "] EMA[" + result[2] + "] RSI[" + result[3] + "] STO[" + result[4] + "]");
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
//        o.setExitTarget(offer.add(new BigDecimal(0.0010)));
        o.setExitStopLoss(offer.subtract(new BigDecimal(0.0005)));
        try {
            StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
            proxy.sendOrder(o);
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sell() {
        Quote quote = getQuote();
        BigDecimal offer = quote.getOffer();
        Order o = new Order();
        o.setSide("SELL");
        o.setPriceType("Market");
        o.setInstrument("EUR/USD");
        o.setDesk("Virtual Forex");
        o.setDurationType("GTC");
        o.setQuantity(new BigDecimal(1));
//        o.setExitTarget(offer.subtract(new BigDecimal(0.0010)));
        o.setExitStopLoss(offer.add(new BigDecimal(0.0005)));
        try {
            StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
            proxy.sendOrder(o);
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                if (position.getPoints().compareTo(new BigDecimal(3)) == 0 || position.getPoints().compareTo(new BigDecimal(3)) == 1) {
                    try {
                        proxy.closePosition(position.getPositionID());
                    } catch (RemoteException ex) {
                        Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    private void clearPosition() {
        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Position[] positions = new Position[0];
        try {
            positions = proxy.getPositions();
        } catch (RemoteException ex) {
            Logger.getLogger(JobTradeUp.class.getName()).log(Level.SEVERE, null, ex);
        }

        int buyNum = 0;
        for (Position position : positions) {
            if (position.getStatus().equalsIgnoreCase("OPEN")) {
                buyNum++;
            }
        }

        if (buyNum == 0) {
            buyState = false;
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
