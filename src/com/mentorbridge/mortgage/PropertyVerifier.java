package com.mentorbridge.mortgage;

public class PropertyVerifier {

    public boolean verifyProperty(Property property) {

        System.out.println("\n--- Property Verification ---");
        System.out.println("Address : " +
                property.getPropertyAddress());

        System.out.println("Value   : ₹" +
                property.getPropertyValue());

        if (property.getPropertyValue() >= 1000000) {
            System.out.println("Property Verification : PASSED");
            return true;
        }

        System.out.println("Property Verification : FAILED");
        return false;
    }
}