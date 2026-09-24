package com.mentorbridge.mortgage;

public class CreditChecker {

    public boolean checkCredit(CreditCheck creditCheck) {

        System.out.println("\n--- Credit Check ---");
        System.out.println("Credit Score : " +
                creditCheck.getCreditScore());

        if (creditCheck.getCreditScore() >= 700) {
            System.out.println("Credit Check : PASSED");
            return true;
        }

        System.out.println("Credit Check : FAILED");
        return false;
    }
}