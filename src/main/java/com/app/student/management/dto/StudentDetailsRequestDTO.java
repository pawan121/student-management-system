package com.app.student.management.dto;

import lombok.Data;

@Data
public class StudentDetailsRequestDTO {
    private StudentDTO student;
    private StudentAcademicInfoDTO academic;
    private StudentAddressDTO address;
    private StudentBasicInfoDTO basic;
    private StudentGuardianInfoDTO guardian;
}
