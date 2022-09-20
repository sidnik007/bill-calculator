package com.nelkinda;

public class BillCalculator {
    public double calculateBill(final String planType, final int numberOfConnections) {
        int additionalConnections = numberOfConnections - 1;
        if (planType.equals("Platinum"))
            return 999 + (double)(additionalConnections * 199);
        else
            return 799 + (double)(additionalConnections * 299);
    }
}
