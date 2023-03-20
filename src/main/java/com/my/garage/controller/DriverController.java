package com.my.garage.controller;

import com.my.garage.api.DriverApi;
import com.my.garage.dto.DriverDto;
import com.my.garage.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
public class DriverController implements DriverApi {
    private final DriverService driverService;

    @Override
    public DriverDto createDriver(DriverDto driverDto) {
        return null;
    }

    @Override
    public List<DriverDto> getDriversByCriteria(String name,
                                                Integer passport,
                                                String license,
                                                LocalDate minAge,
                                                LocalDate maxAge,
                                                Duration minExperience,
                                                Duration maxExperience,
                                                Pageable pageable) {
        return null;
    }
}
