package com.app.student.management.service;

import com.app.student.management.dto.StudentDTO;
import com.app.student.management.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {
    @Autowired
    private StudentRepo studentRepo;

    public StudentDTO getStudentDetails(String studentId) {
        return studentRepo.findByStudentId(studentId).map(data-> {
                    StudentDTO dto = new StudentDTO();
                    dto.setStudentId(data.getStudentId());
                    dto.setFirstName(data.getBasicInfo().getFirstName());
                    dto.setLastName(data.getBasicInfo().getLastName());
                    dto.setEmail(data.getBasicInfo().getEmail());
                    dto.setPhoneNumber(data.getBasicInfo().getPhoneNumber());
                    dto.setGender(data.getBasicInfo().getGender());
                    dto.setDob(data.getBasicInfo().getDateOfBirth());
                    return dto;
                }).orElse(new StudentDTO());
    }
}
