package com.app.student.management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;

    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
}

