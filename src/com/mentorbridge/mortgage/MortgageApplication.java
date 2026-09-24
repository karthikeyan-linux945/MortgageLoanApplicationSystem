package com.mentorbridge.mortgage;

public class MortgageApplication {

    private String applicationId;
    private Customer customer;
    private Property property;
    private CreditCheck creditCheck;
    private MortgageLoan mortgageLoan;

    private String status;

    public MortgageApplication(String applicationId,
                               Customer customer,
                               Property property,
                               CreditCheck creditCheck,
                               MortgageLoan mortgageLoan) {

        this.applicationId = applicationId;
        this.customer = customer;
        this.property = property;
        this.creditCheck = creditCheck;
        this.mortgageLoan = mortgageLoan;

        this.status = "PENDING";
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getStatus() {
        return status;
    }

    public void processApplication() {

        System.out.println("\n=================================");
        System.out.println("   MORTGAGE LOAN APPLICATION");
        System.out.println("=================================");

        System.out.println("Application ID : " + applicationId);

        customer.displayCustomer();

        // Employment verification
        System.out.println("\n--- Employment & Income Verification ---");

        System.out.println("Company : " +
                customer.getEmployment().getCompanyName());

        System.out.println("Job     : " +
                customer.getEmployment().getJobTitle());

        System.out.println("Experience : " +
                customer.getEmployment().getExperienceYears()
                + " years");

        System.out.println("Monthly Income : ₹" +
                customer.getIncome().getMonthlyIncome());

        boolean employmentValid =
                customer.getEmployment().getExperienceYears() >= 2;

        boolean incomeValid =
                customer.getIncome().getMonthlyIncome() >= 30000;

        if (employmentValid && incomeValid) {
            System.out.println("Employment & Income : PASSED");
        } else {
            System.out.println("Employment & Income : FAILED");
            status = "REJECTED";
            return;
        }

        // Credit check
        CreditChecker creditChecker = new CreditChecker();

        boolean creditValid =
                creditChecker.checkCredit(creditCheck);

        if (!creditValid) {
            status = "REJECTED";
            return;
        }

        // Property verification
        PropertyVerifier propertyVerifier =
                new PropertyVerifier();

        boolean propertyValid =
                propertyVerifier.verifyProperty(property);

        if (!propertyValid) {
            status = "REJECTED";
            return;
        }

        // Loan validation
        System.out.println("\n--- Eligibility Check ---");

        if (!mortgageLoan.validateLoan()) {
            System.out.println("Loan Eligibility : FAILED");
            status = "REJECTED";
            return;
        }

        System.out.println("Loan Eligibility : PASSED");

        // Loan calculation
        System.out.println("\n--- Loan Calculation ---");

        System.out.println("Loan Amount : ₹" +
                mortgageLoan.getLoanAmount());

        System.out.println("Interest Rate : " +
                mortgageLoan.getInterestRate() + "%");

        double emi = mortgageLoan.calculateEMI();

        System.out.printf("Monthly EMI : ₹%.2f%n", emi);

        // Approval
        System.out.println("\n--- Loan Decision ---");

        mortgageLoan.approveLoan();

        status = "APPROVED";

        // Processing
        mortgageLoan.processLoan();

        System.out.println("\nFinal Status : " + status);
        System.out.println("=================================");
    }
}