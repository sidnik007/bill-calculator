package com.nelkinda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillCalculatorTest {

    @Test
    void testPlatinumSingleConnectionReturns999() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(999, billCalculator.calculateBill("Platinum", 1));
    }

    @Test
    void testPlatinumTwoConnectionReturns1198() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(1198, billCalculator.calculateBill("Platinum", 2));
    }
}
