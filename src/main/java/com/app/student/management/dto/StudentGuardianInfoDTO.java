package com.app.student.management.dto;

public class StudentGuardianInfoDTO {
    private String guardianName;
    private String relation;
    private String contactNumber;

    public StudentGuardianInfoDTO() {
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public String getRelation() {
        return relation;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
