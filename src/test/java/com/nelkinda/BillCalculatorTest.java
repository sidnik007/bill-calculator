package com.nelkinda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillCalculatorTest {

    @Test
    void testPlatinumSingleConnectionReturns999() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(999, billCalculator.calculateBill("Platinum", 1, 0));
    }

    @Test
    void testPlatinumTwoConnectionReturns1198() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(1198, billCalculator.calculateBill("Platinum", 2, 0));
    }

    @Test
    void testGoldSingleConnectionReturns799() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(799, billCalculator.calculateBill("Gold", 1, 0));
    }

    @Test
    void testGoldTwoConnectionReturns1098() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(1098, billCalculator.calculateBill("Gold", 2, 0));
    }

    @Test
    void testSilverSingleConnectionReturns599() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(599, billCalculator.calculateBill("Silver", 1, 0));
    }

    @Test
    void testSilverTwoConnectionReturns998() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(998, billCalculator.calculateBill("Silver", 2, 0));
    }

    @Test
    void testPlatinumSingleConnectionWith1530MinutesReturns1038() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(1038, billCalculator.calculateBill("Platinum", 1, 1530));
    }

}
