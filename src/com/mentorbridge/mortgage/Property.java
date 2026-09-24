package com.mentorbridge.mortgage;

public class Property {

    private String propertyAddress;
    private double propertyValue;

    public Property(String propertyAddress,
                    double propertyValue) {

        this.propertyAddress = propertyAddress;
        this.propertyValue = propertyValue;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public double getPropertyValue() {
        return propertyValue;
    }
}