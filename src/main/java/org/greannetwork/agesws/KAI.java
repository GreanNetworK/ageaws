/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greannetwork.agesws;

import com.novativa.www.ws.streamsterapi.Bar;
import com.novativa.www.ws.streamsterapi.StreamsterApiInterfaceProxy;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.MAType;
import com.tictactec.ta.lib.MInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author San
 */
public class KAI {

    public static void main(String[] args) throws RemoteException {
        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Bar[] bars = proxy.getBars("EUR/USD", "5 Minutes", "f");

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

        double[] ma50 = new double[close.size() - 49];
        double[] ema5 = new double[close.size() - 4];
        double[] ema100 = new double[close.size() - 99];
        double[] rsi = new double[close.size() - 14];
        double[] adx10 = new double[close.size() - 19];
        double[] minusDI10 = new double[close.size() - 10];
        double[] plusDI10 = new double[close.size() - 10];
        double[] sar = new double[close.size() - 1];
        double[] slowK = new double[close.size() - 8];
        double[] slowD = new double[close.size() - 8];

        double[] bbandsU = new double[close.size() - 19];
        double[] bbandsM = new double[close.size() - 19];
        double[] bbandsL = new double[close.size() - 19];

        Core c = new Core();
        c.macd(0, close.size() - 1, closeArray, 12, 26, 9, new MInteger(), new MInteger(), macd, signal, histogram);
        c.sma(0, close.size() - 1, closeArray, 50, new MInteger(), new MInteger(), ma50);
        c.ema(0, close.size() - 1, closeArray, 5, new MInteger(), new MInteger(), ema5);
        c.ema(0, close.size() - 1, closeArray, 100, new MInteger(), new MInteger(), ema100);
        c.rsi(0, close.size() - 1, closeArray, 14, new MInteger(), new MInteger(), rsi);
        c.adx(0, close.size() - 1, highArray, lowArray, closeArray, 10, new MInteger(), new MInteger(), adx10);
        c.minusDI(0, close.size() - 1, highArray, lowArray, closeArray, 10, new MInteger(), new MInteger(), minusDI10);
        c.plusDI(0, close.size() - 1, highArray, lowArray, closeArray, 10, new MInteger(), new MInteger(), plusDI10);
        c.sar(0, close.size() - 1, highArray, lowArray, 0.02, 0.2, new MInteger(), new MInteger(), sar);
        c.stoch(0, close.size() - 1, highArray, lowArray, closeArray, 5, 3, MAType.Ema, 3, MAType.Ema, new MInteger(), new MInteger(), slowK, slowD);
        c.bbands(0, close.size() - 1, closeArray, 20, 2.000000e+0, 2.000000e+0, MAType.Ema, new MInteger(), new MInteger(), bbandsU, bbandsM, bbandsL);

        macd = shiftList(macd, close.size());
        signal = shiftList(signal, close.size());
        histogram = shiftList(histogram, close.size());
        ma50 = shiftList(ma50, close.size());
        ema5 = shiftList(ema5, close.size());
        ema100 = shiftList(ema100, close.size());
        rsi = shiftList(rsi, close.size());
        adx10 = shiftList(adx10, close.size());
        minusDI10 = shiftList(minusDI10, close.size());
        plusDI10 = shiftList(plusDI10, close.size());
        sar = shiftList(sar, close.size());
        slowK = shiftList(slowK, close.size());
        slowD = shiftList(slowD, close.size());
        bbandsU = shiftList(bbandsU, close.size());
        bbandsM = shiftList(bbandsM, close.size());
        bbandsL = shiftList(bbandsL, close.size());

        boolean state = false;
        List<String> logs = new ArrayList<>();
        BigDecimal price = BigDecimal.ZERO;
        BigDecimal total = BigDecimal.ZERO;

        for (int i = 100; i < openArray.length; i++) {

            Integer[] result = new Integer[5];

            System.out.println(i
                    + " {"
                    + bars[i].getBarDateTime().getTime()
                    + "} Close "
                    + bars[i].getClose()
                    + "\t MACD "
                    + macd[i]
                    + "\t Signal "
                    + signal[i]
                    + "\t Histogram "
                    + histogram[i]
                    + "\t SMA50 "
                    + ma50[i]
                    + "\t EMA5 "
                    + ema5[i]
                    + "\t EMA100 "
                    + ema100[i]
                    + "\t RSI "
                    + rsi[i]
                    + "\t ADX10 "
                    + adx10[i]
                    + "\t MINUS_DI10 "
                    + minusDI10[i]
                    + "\t PLUS_DI10 "
                    + plusDI10[i]
                    + "\t SAR "
                    + sar[i]
                    + "\t BBANDSUPPER "
                    + bbandsU[i]
                    + "\t BBANDSMIDDLE "
                    + bbandsM[i]
                    + "\t BBANDSLOWER "
                    + bbandsL[i]
            );

            boolean closePriceWithSMA50 = trackCut(closeArray, ma50, i, 5);
            boolean ema5WithSMA50 = trackCut(ema5, ma50, i, 5);
            boolean ema100Trend = trackTrend(ema100, i);
            boolean sarWithClosePrice = sar[i] < closeArray[i];
            boolean macdWithSignal = trackCut(macd, signal, i, 5);
            boolean macdHist = histogram[i] > 0;
            boolean stocha = trackCut(slowD, slowK, i, 2);

            System.out.println(bars[i].getBarDateTime().getTime() + " " + closePriceWithSMA50 + " " + ema5WithSMA50 + " " + ema100Trend + " " + sarWithClosePrice + " " + macdWithSignal + " " + macdHist);

            int sum = booleanToInt(closePriceWithSMA50)+booleanToInt(ema5WithSMA50)+booleanToInt(ema100Trend)+booleanToInt(sarWithClosePrice)+booleanToInt(macdWithSignal)+booleanToInt(macdHist);
            
            BigDecimal subtract = bars[i].getClose().subtract(price);
            if (!state && sum >= 4) {
                logs.add(i+" "+bars[i].getBarDateTime().getTime() + " BUY "+bars[i].getClose());
                price = bars[i].getClose();
                state = !state;
            }else if(state && stocha && subtract.compareTo(new BigDecimal(0.0001).setScale(4, RoundingMode.DOWN)) >= 0){  
                logs.add(i+" "+bars[i].getBarDateTime().getTime() + " SELL "+bars[i].getClose()+" GET "+subtract);
                total = total.add(subtract);
                state = !state;
            }else if(state && subtract.compareTo(new BigDecimal(-0.0010).setScale(4, RoundingMode.DOWN)) <= 0){
                logs.add("cut lose"+subtract);
                state = !state;
            }
        }

        logs.stream().forEach((loge) -> {
            System.out.println(loge);
        });
        System.out.println(total);
    }

    private static boolean trackCut(double[] upper, double[] under, int position, int deep) {
        if(upper[position] <= under[position]){
            return false;
        }
        for (int i = (position-1); i > (position - deep); i--) {
            if (upper[i] < under[i]) {
                return true;
            } 
        }
        return false;
    }

    private static boolean trackTrend(double[] real, int position) {
        if(real[position] < real[position-1]){
            return false;
        }
        for (int i = position; i >= 0; i--) {
            return real[i] > real[i-1];
        }
        return false;
    }
    
    private static int booleanToInt(boolean value){
        if(value){
            return 1;
        }else{
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
