package com.app.student.management.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class StudentAddressDTO {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
}
