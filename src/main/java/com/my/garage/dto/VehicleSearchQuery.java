package com.my.garage.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class VehicleSearchQuery {
    private String vin;
    private String licensePlate;
    private String model;
    private String manufacture;
    private LocalDate fromData;
    private LocalDate toDate;
}
