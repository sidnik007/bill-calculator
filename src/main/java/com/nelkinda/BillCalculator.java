package com.nelkinda;

enum PlanType {
    PLATINUM("Platinum", 999, 199, 1500, 1.30),
    GOLD("Gold", 799, 299, 1000, 2.45),
    SILVER("Silver", 599, 399, 500, 3.60);

    final String name;
    final int baseRate;
    final int ratePerAdditionalConnection;
    final int baseMinutes;
    final double ratePerExcessMinute;

    PlanType(final String name, int baseRate, final int ratePerAdditionalConnection, final int baseMinutes, final double ratePerExcessMinute) {
        this.name = name;
        this.baseRate = baseRate;
        this.ratePerAdditionalConnection = ratePerAdditionalConnection;
        this.baseMinutes = baseMinutes;
        this.ratePerExcessMinute = ratePerExcessMinute;
    }
}
public class BillCalculator {
    public double calculateBill(final PlanType planType, final int numberOfConnections, final int actualMinutes) {
        int additionalConnections = numberOfConnections - 1;
        int excessMinutes = getExcessMinutes(actualMinutes, planType.baseMinutes);
        return planType.baseRate + (double) (additionalConnections * planType.ratePerAdditionalConnection) + (excessMinutes * planType.ratePerExcessMinute);
    }

    private static int getExcessMinutes(int actualMinutes, int baseMinutes) {
        return actualMinutes > baseMinutes ? actualMinutes - baseMinutes : 0;
    }
}
