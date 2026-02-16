package com.app.student.management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student_academic_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentAcademicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String course;
    private String department;
    private Integer year;
    private Double gpa;

    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
}

