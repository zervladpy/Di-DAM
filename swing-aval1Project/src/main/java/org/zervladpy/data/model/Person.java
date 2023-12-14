package org.zervladpy.data.model;

import org.zervladpy.utils.AgeCategory;
import org.zervladpy.utils.EmploymentCategory;
import org.zervladpy.utils.Gender;

public class Person {
    static private int count = 0;
    private int id;
    private String name;
    private String occupation;
    private AgeCategory ageCategory;
    private EmploymentCategory employmentCategory;
    private String taxID;
    private boolean usCitizen;
    private Gender gender;
    public Person() {
        this.id = count++;
    }
    public Person(String name, String occupation, AgeCategory ageCategory, EmploymentCategory employmentCategory, String taxID, boolean usCitizen, Gender gender) {
        this.id = count++;
        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.employmentCategory = employmentCategory;
        this.taxID = taxID;
        this.usCitizen = usCitizen;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public EmploymentCategory getEmploymentCategory() {
        return employmentCategory;
    }

    public void setEmploymentCategory(EmploymentCategory employmentCategory) {
        this.employmentCategory = employmentCategory;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public boolean isUsCitizen() {
        return usCitizen;
    }

    public void setUsCitizen(boolean usCitizen) {
        this.usCitizen = usCitizen;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
