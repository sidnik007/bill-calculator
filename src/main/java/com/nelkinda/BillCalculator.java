package com.nelkinda;

public class BillCalculator {
    public double calculateBill(final String planType, final int numberOfConnections, final int minutes) {
        int additionalConnections = numberOfConnections - 1;
        if (planType.equals("Platinum")) {
            int excessMinutes = minutes > 1500 ? minutes - 1500 : 0;
            return 999 + (double) (additionalConnections * 199) + (excessMinutes * 1.30) ;
        }
        if (planType.equals("Gold"))
            return 799 + (double)(additionalConnections * 299);
        else
            return 599 + (double)(additionalConnections * 399);
    }
}
