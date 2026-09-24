package com.mentorbridge.mortgage;

public class MortgageLoanDemo {

    public static void main(String[] args) {

        // ==============================
        // 1. Create Employment
        // ==============================

        Employment employment =
                new Employment(
                        "ABC Technologies",
                        "Software Engineer",
                        4
                );

        // ==============================
        // 2. Create Income
        // ==============================

        Income income =
                new Income(85000);

        // ==============================
        // 3. Create Property
        // ==============================

        Property property =
                new Property(
                        "Dindigul, Tamil Nadu",
                        4500000
                );

        // ==============================
        // 4. Create Credit Check
        // ==============================

        CreditCheck creditCheck =
                new CreditCheck(780);

        // ==============================
        // 5. Create Customer
        // ==============================

        Customer customer =
                new Customer(
                        "C101",
                        "Arun Kumar",
                        "9876543210",
                        employment,
                        income,
                        property
                );

        // ==============================
        // 6. Create Home Loan
        // ==============================

        MortgageLoan homeLoan =
                new HomeLoan(
                        "HL101",
                        3000000,
                        8.5,
                        property.getPropertyAddress()
                );

        // ==============================
        // 7. Runtime Polymorphism
        // ==============================

        MortgageLoan loan =
                new HomeLoan(
                        "HL102",
                        2500000,
                        8.25,
                        "Madurai, Tamil Nadu"
                );

        System.out.println("\n--- Runtime Polymorphism Demo ---");

        loan.processLoan();

        // ==============================
        // 8. Interface Polymorphism
        // ==============================

        LoanProcessor processor = homeLoan;

        System.out.println("\n--- Interface Polymorphism Demo ---");

        processor.printLoanInfo();

        // ==============================
        // 9. Method Overloading
        // ==============================

        System.out.println("\n--- Method Overloading Demo ---");

        double emi20Years =
                homeLoan.calculateEMI();

        double emi15Years =
                homeLoan.calculateEMI(15);

        System.out.printf(
                "20 Year EMI : ₹%.2f%n",
                emi20Years
        );

        System.out.printf(
                "15 Year EMI : ₹%.2f%n",
                emi15Years
        );

        // ==============================
        // 10. Static Method
        // ==============================

        System.out.println("\n--- Static Method Demo ---");

        double staticEMI =
                LoanCalculator.calculateEMI(
                        3000000,
                        8.5,
                        20
                );

        System.out.printf(
                "Static EMI : ₹%.2f%n",
                staticEMI
        );

        // ==============================
        // 11. Create Application
        // ==============================

        MortgageApplication application =
                new MortgageApplication(
                        "APP001",
                        customer,
                        property,
                        creditCheck,
                        homeLoan
                );

        // ==============================
        // 12. Process Application
        // ==============================

        application.processApplication();

        // ==============================
        // 13. Refinance Loan Demo
        // ==============================

        System.out.println(
                "\n--- Refinance Loan Demo ---"
        );

        MortgageLoan refinanceLoan =
                new RefinanceLoan(
                        "RL101",
                        2000000,
                        7.5,
                        1800000
                );

        refinanceLoan.displayLoan();

        System.out.println(
                "Interest : ₹" +
                        refinanceLoan.calculateInterest()
        );

        refinanceLoan.processLoan();
    }
}