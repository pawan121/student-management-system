package com.app.student.management.dto;

import com.app.student.management.entity.StudentAcademicInfo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class StudentDetailsResponseDTO {
    private StudentDTO student;
    private StudentAcademicInfoDTO academic;
    private StudentAddressDTO address;
    private StudentBasicInfoDTO basic;
    private StudentGuardianInfoDTO guardian;
}
