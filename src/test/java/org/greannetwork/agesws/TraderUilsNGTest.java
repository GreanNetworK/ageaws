/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greannetwork.agesws;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Grean
 */
public class TraderUilsNGTest {

    public TraderUilsNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of sma method, of class TraderUils.
     */
    public void testSma() {
        System.out.println("sma");
        List<BigDecimal> datas = null;
        Integer timePeriod = null;
        List expResult = null;
        List result = TraderUils.sma(datas, timePeriod);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ema method, of class TraderUils.
     */
    @Test
    public void testEma() {
        System.out.println("ema");
        List<BigDecimal> datas = new ArrayList<>();
        datas.add(new BigDecimal(10));
        datas.add(new BigDecimal(11));
        datas.add(new BigDecimal(12));
        datas.add(new BigDecimal(13));
        datas.add(new BigDecimal(14));
        datas.add(new BigDecimal(15));
        datas.add(new BigDecimal(16));
        datas.add(new BigDecimal(17));
        datas.add(new BigDecimal(18));

        Integer timePeriod = 5;
        List<BigDecimal> expResult = new ArrayList();
        expResult.add(BigDecimal.ZERO);
        expResult.add(BigDecimal.ZERO);
        expResult.add(BigDecimal.ZERO);
        expResult.add(BigDecimal.ZERO);
        expResult.add(new BigDecimal(12).setScale(4));
        expResult.add(new BigDecimal(12.9999).setScale(4,RoundingMode.HALF_UP));
        expResult.add(new BigDecimal(13.9998).setScale(4,RoundingMode.HALF_UP));
        expResult.add(new BigDecimal(14.9998).setScale(4,RoundingMode.HALF_UP));
        expResult.add(new BigDecimal(15.9998).setScale(4,RoundingMode.HALF_UP));

        List result = TraderUils.ema(datas, timePeriod);

        assertEquals(result.size(), datas.size());
        assertEquals(result, expResult);
    }

}
