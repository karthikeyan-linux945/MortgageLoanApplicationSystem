package com.mentorbridge.mortgage;

public class RefinanceLoan extends MortgageLoan {

    private double existingLoanBalance;

    public RefinanceLoan(String loanId,
                         double loanAmount,
                         double interestRate,
                         double existingLoanBalance) {

        super(loanId, loanAmount, interestRate);
        this.existingLoanBalance = existingLoanBalance;
    }

    @Override
    protected boolean validateLoan() {

        System.out.println("Validating refinance loan...");

        return getLoanAmount() > 0 &&
                existingLoanBalance > 0;
    }

    @Override
    public double calculateInterest() {
        return existingLoanBalance * getInterestRate() / 100;
    }

    @Override
    public void processLoan() {
        System.out.println("Processing Refinance Loan...");
    }

    public double getExistingLoanBalance() {
        return existingLoanBalance;
    }
}