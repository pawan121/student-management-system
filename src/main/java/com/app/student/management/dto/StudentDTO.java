package com.app.student.management.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String studentId;
    private String status;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dob;
    private String email;
    private String phoneNumber;

    private String course;
    private String department;
    private Integer year;
    private Double gpa;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;

    private String guardianName;
    private String relation;
    private String contactNumber;

    /*private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;*/

}
