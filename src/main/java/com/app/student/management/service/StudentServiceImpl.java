package com.app.student.management.service;

import com.app.student.management.dto.*;
import com.app.student.management.entity.Student;
import com.app.student.management.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentServiceImpl {
    @Autowired
    private IStudentRepository studentRepo;

    public StudentDetailsResponseDTO getStudentDetails(String studentId) {
        Student student = studentRepo.findByStudentId(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        // ================= Student DTO =================
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentId(student.getStudentId());
        studentDTO.setFirstName(student.getBasicInfo().getFirstName());
        studentDTO.setLastName(student.getBasicInfo().getLastName());
        studentDTO.setGender(student.getBasicInfo().getGender());
        studentDTO.setDob(student.getBasicInfo().getDateOfBirth());
        studentDTO.setEmail(student.getBasicInfo().getEmail());
        studentDTO.setPhoneNumber(student.getBasicInfo().getPhoneNumber());

        // ================= Academic DTO =================
        StudentAcademicInfoDTO academicDTO = null;
        if (student.getAcademicInfo() != null) {
            academicDTO = new StudentAcademicInfoDTO();
            academicDTO.setCourse(student.getAcademicInfo().getCourse());
            academicDTO.setDepartment(student.getAcademicInfo().getDepartment());
            academicDTO.setYear(student.getAcademicInfo().getYear());
            academicDTO.setGpa(student.getAcademicInfo().getGpa());
        }

        // ================= Address DTO =================
        StudentAddressDTO addressDTO = null;
        if (student.getAddress() != null) {
            addressDTO = new StudentAddressDTO();
            addressDTO.setAddressLine1(student.getAddress().getAddressLine1());
            addressDTO.setAddressLine2(student.getAddress().getAddressLine2());
            addressDTO.setCity(student.getAddress().getCity());
            addressDTO.setState(student.getAddress().getState());
            addressDTO.setZipCode(student.getAddress().getZipCode());
        }

        // ================= Guardian DTO =================
        StudentGuardianInfoDTO guardianDTO = null;
        if (student.getGuardianInfo() != null) {
            guardianDTO = new StudentGuardianInfoDTO();
            guardianDTO.setGuardianName(student.getGuardianInfo().getGuardianName());
            guardianDTO.setRelation(student.getGuardianInfo().getRelation());
            guardianDTO.setContactNumber(student.getGuardianInfo().getContactNumber());
        }
        StudentBasicInfoDTO basicDTO = null;
        if (student.getBasicInfo() != null) {
            basicDTO = new StudentBasicInfoDTO();
            basicDTO.setFirstName(student.getBasicInfo().getFirstName());
            basicDTO.setLastName(student.getBasicInfo().getLastName());
            basicDTO.setGender(student.getBasicInfo().getGender());
            basicDTO.setDateOfBirth(student.getBasicInfo().getDateOfBirth());
            basicDTO.setEmail(student.getBasicInfo().getEmail());
            basicDTO.setPhoneNumber(student.getBasicInfo().getPhoneNumber());
        }
        // ================= Final Response =================
        StudentDetailsResponseDTO response = new StudentDetailsResponseDTO();
        response.setStudent(studentDTO);
        response.setAcademic(academicDTO);
        response.setAddress(addressDTO);
        response.setBasic(basicDTO);
        response.setGuardian(guardianDTO);
        return response;
    }
}
