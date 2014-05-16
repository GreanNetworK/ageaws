/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greannetwork.agesws;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Grean
 */
public class TraderUils {

    public static List<BigDecimal> sma(List<BigDecimal> datas, Integer timePeriod) {
        List<BigDecimal> values = shiftList(timePeriod);
        int initial = timePeriod - 1;

        for (int index = initial; index < datas.size(); index++) {
            BigDecimal reduce = datas
                    .subList(index - initial, index + 1)
                    .stream()
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            BigDecimal sma = reduce
                    .divide(new BigDecimal(timePeriod))
                    .setScale(4, RoundingMode.HALF_UP);
            values.add(sma);
        }
        return values;
    }

    public static List<BigDecimal> ema(List<BigDecimal> datas, Integer timePeriod) {
        List<BigDecimal> values = shiftList(timePeriod);
        BigDecimal lastEma = sma(datas, timePeriod).get(timePeriod-1);
        values.add(lastEma);

        for (int index = timePeriod; index < datas.size(); index++) {
            BigDecimal subStactCloseWithLastEma = datas.get(index).subtract(lastEma);
            BigDecimal multiplyWithSTC = smoothingConstant(timePeriod).multiply(subStactCloseWithLastEma);
            BigDecimal addWithLastEma = lastEma.add(multiplyWithSTC).setScale(4, RoundingMode.HALF_UP);

            lastEma = addWithLastEma;
            values.add(lastEma);
        }
        return values;
    }

    private static BigDecimal smoothingConstant(Integer timePeriod) {
        BigDecimal const1 = new BigDecimal(2);
        BigDecimal const2 = new BigDecimal(timePeriod + 1);
        BigDecimal stc = const1.divide(const2, 4, RoundingMode.HALF_UP);
        return stc;
    }

    private static List<BigDecimal> shiftList(Integer timePeriod) {
        List<BigDecimal> values = new LinkedList<>();
        for (int index = 0; index < (timePeriod-1); index++) {
            values.add(BigDecimal.ZERO);
        }
        return values;
    }
}
