package com.my.garage.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class DriverSearchQuery {
    private String name;
    private Integer passport;
    private String license;
    private LocalDate minAge;
    private LocalDate maxAge;
    private LocalDate minExperience;
    private LocalDate maxExperience;
}
