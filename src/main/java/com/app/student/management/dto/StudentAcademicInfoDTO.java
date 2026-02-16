package com.app.student.management.dto;

public class StudentAcademicInfoDTO {
    private String course;
    private String department;
    private Integer year;
    private Double gpa;

    public StudentAcademicInfoDTO() {
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getCourse() {
        return course;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getYear() {
        return year;
    }

    public Double getGpa() {
        return gpa;
    }
}
