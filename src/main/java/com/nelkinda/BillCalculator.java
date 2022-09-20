package com.nelkinda;

public class BillCalculator {
    public double calculateBill(final String planType, final int numberOfConnections) {
        int additionalConnections = numberOfConnections - 1;
        return 999 + (double)(additionalConnections * 199);
    }
}
