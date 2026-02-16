package com.app.student.management.dto;

import com.app.student.management.entity.StudentAcademicInfo;

public class StudentDetailsResponseDTO {
    private StudentDTO student;
    private StudentAcademicInfoDTO academic;
    private StudentAddressDTO address;
    private StudentBasicInfoDTO basic;
    private StudentGuardianInfoDTO guardian;

    public StudentDetailsResponseDTO() {
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

    public void setAcademic(StudentAcademicInfoDTO academic) {
        this.academic = academic;
    }

    public void setAddress(StudentAddressDTO address) {
        this.address = address;
    }

    public void setBasic(StudentBasicInfoDTO basic) {
        this.basic = basic;
    }

    public void setGuardian(StudentGuardianInfoDTO guardian) {
        this.guardian = guardian;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public StudentAcademicInfoDTO getAcademic() {
        return academic;
    }

    public StudentAddressDTO getAddress() {
        return address;
    }

    public StudentBasicInfoDTO getBasic() {
        return basic;
    }

    public StudentGuardianInfoDTO getGuardian() {
        return guardian;
    }
}
