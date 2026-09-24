package com.mentorbridge.mortgage;

public class HomeLoan extends MortgageLoan {

    private String propertyAddress;

    public HomeLoan(String loanId,
                    double loanAmount,
                    double interestRate,
                    String propertyAddress) {

        super(loanId, loanAmount, interestRate);
        this.propertyAddress = propertyAddress;
    }

    @Override
    protected boolean validateLoan() {

        System.out.println("Validating home loan...");

        return getLoanAmount() > 0 &&
                propertyAddress != null &&
                !propertyAddress.isEmpty();
    }

    @Override
    public double calculateInterest() {
        return getLoanAmount() * getInterestRate() / 100;
    }

    @Override
    public void processLoan() {
        System.out.println("Processing Home Loan...");
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }
}