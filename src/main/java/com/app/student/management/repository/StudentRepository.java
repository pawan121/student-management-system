package com.app.student.management.repository;

import com.app.student.management.dto.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.student.management.entity.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

    Optional<Student> findByStudentId(String studentId);

    @Query("SELECT COUNT(s) FROM Student s")
    Long GetTotalStudentsRecord();

    }





