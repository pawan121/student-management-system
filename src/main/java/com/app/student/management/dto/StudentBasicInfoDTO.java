package com.app.student.management.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class StudentBasicInfoDTO {
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
}
