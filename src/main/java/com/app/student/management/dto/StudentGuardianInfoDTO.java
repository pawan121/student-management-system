package com.app.student.management.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class StudentGuardianInfoDTO {
    private String guardianName;
    private String relation;
    private String contactNumber;
}
