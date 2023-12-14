package org.zervladpy.presentation.event;

import java.util.EventObject;

public class FormEvent extends EventObject {

    private String name;
    private String occupation;
    private int ageCategory;
    private int employment;
    private String taxId;
    private boolean usCitizen;
    private int gender;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String occupation, int ageCategory, int employment, String taxId, boolean usCitizen, int gender) {
        super(source);
        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.employment = employment;
        this.taxId = taxId;
        this.usCitizen = usCitizen;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public int getEmployment() {
        return employment;
    }

    public String getTaxId() {
        return taxId;
    }

    public boolean getUsCitizen() {
        return usCitizen;
    }

    public int getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "FormEvent{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", ageCategory=" + ageCategory +
                ", employment=" + employment +
                ", taxId='" + taxId + '\'' +
                ", usCitizen=" + usCitizen +
                ", gender=" + gender +
                '}';
    }
}
