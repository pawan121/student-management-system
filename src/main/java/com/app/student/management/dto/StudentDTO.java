package com.app.student.management.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StudentDTO {
    private String studentId;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dob;
    private String email;
    private String phoneNumber;

}
