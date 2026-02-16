package com.app.student.management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id", unique = true, nullable = false)
    private String studentId;

    @Column(name = "status")
    private String status;

    // One-to-One mapping with Basic Info
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentBasicInfo basicInfo;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentAddress address;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentAcademicInfo academicInfo;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
     private StudentGuardianInfo guardianInfo;
}
