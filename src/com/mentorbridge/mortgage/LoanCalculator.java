package com.mentorbridge.mortgage;

public class LoanCalculator {

    private LoanCalculator() {
        // Prevent object creation
    }

    public static double calculateEMI(double principal,
                                      double annualRate,
                                      int years) {

        double monthlyRate = annualRate / 12 / 100;
        int months = years * 12;

        return (principal * monthlyRate *
                Math.pow(1 + monthlyRate, months))
                /
                (Math.pow(1 + monthlyRate, months) - 1);
    }

    public static double calculateTotalInterest(double principal,
                                                double annualRate,
                                                int years) {

        double emi = calculateEMI(principal, annualRate, years);
        int months = years * 12;

        return (emi * months) - principal;
    }
}