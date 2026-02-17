package com.app.student.management.service;

import com.app.student.management.dto.StudentDetailsResponseDTO;

public interface IStudentServiceImpl {
    public StudentDetailsResponseDTO getStudentDetails(String studentId);
}
