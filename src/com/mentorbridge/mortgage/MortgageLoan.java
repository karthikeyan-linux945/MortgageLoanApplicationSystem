package com.mentorbridge.mortgage;

public abstract class MortgageLoan implements LoanProcessor {

    // Encapsulation
    private String loanId;
    private double loanAmount;
    private double interestRate;

    public MortgageLoan(String loanId, double loanAmount, double interestRate) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    // Getters
    public String getLoanId() {
        return loanId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Setters
    public void setLoanAmount(double loanAmount) {
        if (loanAmount > 0) {
            this.loanAmount = loanAmount;
        }
    }

    public void setInterestRate(double interestRate) {
        if (interestRate > 0) {
            this.interestRate = interestRate;
        }
    }

    // Concrete method
    public double calculateEMI() {
        double monthlyRate = interestRate / 12 / 100;
        int months = 20 * 12;

        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }

    // Method overloading
    public double calculateEMI(int years) {
        double monthlyRate = interestRate / 12 / 100;
        int months = years * 12;

        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }

    // Concrete method
    public void approveLoan() {
        System.out.println("Loan approved for processing.");
    }

    // Concrete method
    public void displayLoan() {
        System.out.println("Loan ID       : " + loanId);
        System.out.println("Loan Amount   : ₹" + loanAmount);
        System.out.println("Interest Rate : " + interestRate + "%");
    }

    // Abstract method
    protected abstract boolean validateLoan();
}