package com.mentorbridge.mortgage;

public class Customer {

    private String customerId;
    private String name;
    private String phone;

    // HAS-A relationships
    private Employment employment;
    private Income income;
    private Property property;

    public Customer(String customerId,
                    String name,
                    String phone,
                    Employment employment,
                    Income income,
                    Property property) {

        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.employment = employment;
        this.income = income;
        this.property = property;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Employment getEmployment() {
        return employment;
    }

    public Income getIncome() {
        return income;
    }

    public Property getProperty() {
        return property;
    }

    public void displayCustomer() {

        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Phone       : " + phone);
    }
}