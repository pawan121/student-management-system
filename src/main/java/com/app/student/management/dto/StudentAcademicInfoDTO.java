package com.app.student.management.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentAcademicInfoDTO {
    private String course;
    private String department;
    private Integer year;
    private Double gpa;
}
