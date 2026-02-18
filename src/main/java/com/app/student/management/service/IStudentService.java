package com.app.student.management.service;

import com.app.student.management.dto.StudentDTO;
import com.app.student.management.entity.Student;

public interface IStudentService {
    public StudentDTO getStudentDetails(String studentId);
    public Long getStudentCount();

}
