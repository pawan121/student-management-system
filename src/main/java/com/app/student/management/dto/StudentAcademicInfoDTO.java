package com.app.student.management.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class StudentAcademicInfoDTO {
    private String course;
    private String department;
    private Integer year;
    private Double gpa;
}
