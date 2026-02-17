package com.app.student.management.service;

import com.app.student.management.dto.StudentDetailsRequestDTO;
import com.app.student.management.dto.StudentDetailsResponseDTO;
import com.app.student.management.entity.Student;

public interface IStudentService {
    public StudentDetailsResponseDTO getStudentDetails(String studentId);
    public Long getStudentCount();
    public String saveStudentDetails(StudentDetailsRequestDTO request);

}
