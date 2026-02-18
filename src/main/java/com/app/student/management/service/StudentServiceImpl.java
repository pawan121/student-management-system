package com.app.student.management.service;

import com.app.student.management.dto.*;
import com.app.student.management.entity.*;
import com.app.student.management.exception.StudentNotFoundException;
import com.app.student.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository studentRepo;

    public StudentDTO getStudentDetails(String studentId) {
        Student student = studentRepo.findByStudentId(studentId)
                .orElseThrow(() -> new StudentNotFoundException("Student Not Found With Student_Id " + studentId));

        StudentDTO dto = new StudentDTO();

        // ================= STUDENT =================
        dto.setStudentId(student.getStudentId());
        dto.setStatus(student.getStatus());

        // ================= BASIC INFO =================
        if (student.getBasicInfo() != null) {
            dto.setFirstName(student.getBasicInfo().getFirstName());
            dto.setLastName(student.getBasicInfo().getLastName());
            dto.setGender(student.getBasicInfo().getGender());
            dto.setDob(student.getBasicInfo().getDateOfBirth());
            dto.setEmail(student.getBasicInfo().getEmail());
            dto.setPhoneNumber(student.getBasicInfo().getPhoneNumber());
        }

        // ================= ACADEMIC INFO =================
        if (student.getAcademicInfo() != null) {
            dto.setCourse(student.getAcademicInfo().getCourse());
            dto.setDepartment(student.getAcademicInfo().getDepartment());
            dto.setYear(student.getAcademicInfo().getYear());
            dto.setGpa(student.getAcademicInfo().getGpa());
        }

        // ================= ADDRESS =================
        if (student.getAddress() != null) {
            dto.setAddressLine1(student.getAddress().getAddressLine1());
            dto.setAddressLine2(student.getAddress().getAddressLine2());
            dto.setCity(student.getAddress().getCity());
            dto.setState(student.getAddress().getState());
            dto.setZipCode(student.getAddress().getZipCode());
        }

        // ================= GUARDIAN =================
        if (student.getGuardianInfo() != null) {
            dto.setGuardianName(student.getGuardianInfo().getGuardianName());
            dto.setRelation(student.getGuardianInfo().getRelation());
            dto.setContactNumber(student.getGuardianInfo().getContactNumber());
        }

        return dto;
    }

    @Override
    public Long getStudentCount() {
        return studentRepo.GetTotalStudentsRecord();
    }

}
