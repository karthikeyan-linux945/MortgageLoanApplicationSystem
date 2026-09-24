package com.mentorbridge.mortgage;

public class Employment {

    private String companyName;
    private String jobTitle;
    private int experienceYears;

    public Employment(String companyName,
                      String jobTitle,
                      int experienceYears) {

        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.experienceYears = experienceYears;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
}