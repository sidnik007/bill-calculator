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

    public static final int DISCOUNT_LIMIT = 3;

    public static double calculateBill(final PlanType planType, final int numberOfConnections, final int actualMinutes) {
        return isEligibleForDiscount(numberOfConnections)
                ? calculateDiscountedBill(planType, numberOfConnections, getExcessMinutes(actualMinutes, planType.baseMinutes))
                : calculateNonDiscountedBill(planType, numberOfConnections, getExcessMinutes(actualMinutes, planType.baseMinutes));
    }

    private static boolean isEligibleForDiscount(int numberOfConnections) {
        return numberOfConnections > DISCOUNT_LIMIT;
    }

    private static double calculateNonDiscountedBill(PlanType planType, int numberOfConnections, int excessMinutes) {
        int additionalConnections = numberOfConnections - 1;
        return planType.baseRate + (double) (additionalConnections * planType.ratePerAdditionalConnection) + (excessMinutes * planType.ratePerExcessMinute);
    }

    private static double calculateDiscountedBill(PlanType planType, int numberOfConnections, int excessMinutes) {
        int discountedConnections = numberOfConnections - DISCOUNT_LIMIT;
        return planType.baseRate + (double) (2 * planType.ratePerAdditionalConnection) + (excessMinutes * planType.ratePerExcessMinute) + (99 * discountedConnections);
    }

    private static int getExcessMinutes(int actualMinutes, int baseMinutes) {
        return actualMinutes > baseMinutes ? actualMinutes - baseMinutes : 0;
    }
}
