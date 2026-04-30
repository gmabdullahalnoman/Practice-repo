package org.example;

import java.util.Scanner;

public class IncentiveCalculator {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Incentive Calculation System ---");

        System.out.print("Enter Role Name: ");
        String role = scanner.nextLine();

        System.out.print("Enter Target Achievement (%): ");
        double actualAchievement = scanner.nextDouble();

        System.out.print("Enter Threshold Achievement (%): ");
        double threshold = scanner.nextDouble();

        System.out.print("Enter Base Incentive (Amount): ");
        double baseIncentive = scanner.nextDouble();

        System.out.print("Enter Increment per % (Amount): ");
        double incrementRate = scanner.nextDouble();

        System.out.print("Enter Max Cap Limit (%): ");
        double maxCap = scanner.nextDouble();

        // Calculation Logic
        double result = calculateIncentive(actualAchievement, threshold, baseIncentive, incrementRate, maxCap);

        System.out.println("\n--- Result for " + role + " ---");
        System.out.printf("Total Incentive Earned: %.2f BDT%n", result);

        scanner.close();
    }

    public static double calculateIncentive(double actual, double threshold, double base, double rate, double cap) {
        if (actual < threshold) {
            return 0.0;
        }

        // If achievement exceeds the cap, restrict it to the cap percentage
        double effectiveAchievement = Math.min(actual, cap);

        // Calculate the difference
        double difference = effectiveAchievement - threshold;

        return base + (difference * rate);
    }
}
