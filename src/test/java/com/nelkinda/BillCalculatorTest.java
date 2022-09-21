package com.nelkinda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.nelkinda.BillCalculator.*;
import static com.nelkinda.PlanType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BillCalculatorTest {

    @Test
    void testPlatinumSingleConnectionReturns999() {
        assertEquals(999, calculateBill(PLATINUM, 1, 0));
    }

    @Test
    void testPlatinumTwoConnectionReturns1198() {
        assertEquals(1198, calculateBill(PLATINUM, 2, 0));
    }

    @Test
    void testGoldSingleConnectionReturns799() {
        assertEquals(799, calculateBill(GOLD, 1, 0));
    }

    @Test
    void testGoldTwoConnectionReturns1098() {
        assertEquals(1098, calculateBill(GOLD, 2, 0));
    }

    @Test
    void testSilverSingleConnectionReturns599() {
        assertEquals(599, calculateBill(SILVER, 1, 0));
    }

    @Test
    void testSilverTwoConnectionReturns998() {
        assertEquals(998, calculateBill(SILVER, 2, 0));
    }

    @Test
    void testPlatinumSingleConnectionWith1500MinutesReturns999() {
        assertEquals(999, calculateBill(PLATINUM, 1, 999));
    }

    @Test
    void testPlatinumSingleConnectionWith1530MinutesReturns1038() {
        assertEquals(1038, calculateBill(PLATINUM, 1, 1530));
    }

    @Test
    void testGoldSingleConnectionWith1000MinutesReturns799() {
        assertEquals(799, calculateBill(GOLD, 1, 1000));
    }

    @Test
    void testGoldSingleConnectionWith1010MinutesReturns823point5() {
        assertEquals(823.5, calculateBill(GOLD, 1, 1010));
    }

    @Test
    void testSilverSingleConnectionWith500MinutesReturns599() {
        assertEquals(599, calculateBill(SILVER, 1, 500));
    }

    @Test
    void testSilverSingleConnectionWith520MinutesReturns671() {
        assertEquals(671, calculateBill(SILVER, 1, 520));
    }

    @Test
    void testPlatinum3ConnectionsReturn1397() {
        assertEquals(1397, calculateBill(PLATINUM, 3, 1500));
    }

    @Test
    void testPlatinum4ConnectionsReturn1496() {
        assertEquals(1496, calculateBill(PLATINUM, 4, 1496));
    }

    @ParameterizedTest
    @CsvSource({
            "1496, PLATINUM, 4, 1246",
            "1763.6, PLATINUM, 3, 1782",
            "2150.1, PLATINUM, 5, 1927",
            "1098, GOLD, 2, 45",
            "2296.7, GOLD, 6, 1246",
            "2019.8, SILVER, 3, 673",
            "1595, SILVER, 5, 120"
    })
    void testBillCalculation(double expected, PlanType planType, int numberOfConnections, int actualMinutes) {
        assertEquals(expected, calculateBill(planType, numberOfConnections, actualMinutes), 1);
    }

}
