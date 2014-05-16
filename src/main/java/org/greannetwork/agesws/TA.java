/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greannetwork.agesws;

import com.novativa.www.ws.streamsterapi.Bar;
import com.novativa.www.ws.streamsterapi.StreamsterApiInterfaceProxy;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.RetCode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Grean
 */
public class TA {

    public static void main(String[] args) throws RemoteException {

        StreamsterApiInterfaceProxy proxy = new StreamsterApiInterfaceProxy();
        Bar[] bars = proxy.getBars("EUR/USD", "5 Minutes", "f");
        List<BigDecimal> collect = Arrays.asList(bars).stream().map(c -> c.getClose()).collect(Collectors.toList());

        double[] closeArray = collect.stream().mapToDouble(BigDecimal::doubleValue).toArray();
        double[] out10 = new double[collect.size() - 9];
        double[] out50 = new double[collect.size() - 49];

        Core c = new Core();
        RetCode emaRet10 = c.ema(0, collect.size() - 1, closeArray, 10, new MInteger(), new MInteger(), out10);
        RetCode emaRet50 = c.ema(0, collect.size() - 1, closeArray, 50, new MInteger(), new MInteger(), out50);
        int[] mark = new int[2];
        List<String> logs = new ArrayList<>();

        Boolean state = false;
        BigDecimal price = BigDecimal.ZERO;

        for (int i = 0; i < out50.length; i++) {

            BigDecimal ema10 = new BigDecimal(out10[i + 39]).setScale(8, RoundingMode.DOWN);
            BigDecimal ema50 = new BigDecimal(out50[i]).setScale(8, RoundingMode.DOWN);

            if (ema10.compareTo(ema50) == 1) {
                mark[1] = mark[0];
                mark[0] = 1;
                System.out.print(" + ");
            } else if (ema10.compareTo(ema50) == -1) {
                mark[1] = mark[0];
                mark[0] = -1;
                System.out.print(" - ");
            }

            System.out.println(i
                    + " {"
                    + bars[i + 49].getBarDateTime().getTime()
                    + "} Close "
                    + bars[i + 49].getClose()
                    + " EMA10 "
                    + ema10
                    + " EMA50 "
                    + ema50
            );

            if (!state && mark[0] > mark[1] && i != 0) {
                System.out.println("B => " + bars[i + 49].getClose());
                logs.add(i + " " + bars[i + 49].getBarDateTime().getTime() + " B => " + bars[i + 49].getClose());
                state = !state;
                price = bars[i + 49].getClose();
            }

            if (state && mark[0] < mark[1] && i != 0) {
                System.out.println("S => " + bars[i + 49].getClose());
                logs.add(i + " " + bars[i + 49].getBarDateTime().getTime() + " S => " + bars[i + 49].getClose() + " Get : " + (bars[i + 49].getClose().subtract(price)));
                state = !state;
            }

        }
        logs.stream().forEach((log) -> {
            System.out.println(log);
        });
    }
}
