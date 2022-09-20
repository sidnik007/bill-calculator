package com.nelkinda;

public class BillCalculator {
    public double calculateBill(final String planType, final int numberOfConnections, final int actualMinutes) {
        int additionalConnections = numberOfConnections - 1;
        if (planType.equals("Platinum")) {
            int excessMinutes = getExcessMinutes(actualMinutes, 1500);
            return 999 + (double) (additionalConnections * 199) + (excessMinutes * 1.30) ;
        }
        if (planType.equals("Gold")) {
            int excessMinutes = getExcessMinutes(actualMinutes, 1000);
            return 799 + (double) (additionalConnections * 299) + (excessMinutes * 2.45) ;
        }
        if (planType.equals("Silver")) {
            int excessMinutes = getExcessMinutes(actualMinutes, 500);
            return 599 + (double) (additionalConnections * 399) + (excessMinutes * 3.60);
        }
        return 0;
    }

    private static int getExcessMinutes(int actualMinutes, int baseMinutes) {
        return actualMinutes > baseMinutes ? actualMinutes - baseMinutes : 0;
    }
}
