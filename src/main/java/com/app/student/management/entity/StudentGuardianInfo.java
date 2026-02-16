package com.app.student.management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student_guardian_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentGuardianInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String guardianName;
    private String relation;
    private String contactNumber;

    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
}

