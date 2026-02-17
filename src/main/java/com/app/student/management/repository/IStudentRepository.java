package com.app.student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.student.management.entity.Student;

import java.util.Optional;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer>{

    Optional<Student> findByStudentId(String studentId);

    }




