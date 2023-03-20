package com.my.garage.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class DriverDto implements Serializable {
    private String firstName;
    private String lastName;
    private Integer passportId;
    private String licenseType;
    private LocalDate birthDay;
    private LocalDate employment;
}
