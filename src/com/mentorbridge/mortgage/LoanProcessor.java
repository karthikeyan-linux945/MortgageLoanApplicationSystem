package com.mentorbridge.mortgage;

public interface LoanProcessor {

    void processLoan();

    double calculateInterest();

    default void printLoanInfo() {
        System.out.println("Loan processing system is ready.");
    }
}