package com.nelkinda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillCalculatorTest {

    @Test
    void testPlatinumSingleConnectionReturns999() {
        BillCalculator billCalculator = new BillCalculator();
        assertEquals(999, billCalculator.calculateBill("Platinum", 1));
    }

}
