package com.my.garage.api;

import com.my.garage.dto.DriverDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/drivers")
@Tag(name = "Drivers", description = "EndPoints related to drivers")
public interface DriverApi {
    @Operation(operationId = "add_drivers", summary = "Drivers creation", tags = {"Drivers"})
    @PostMapping
    DriverDto createDriver(DriverDto driverDto);

    @Operation(operationId = "get_drivers", summary = "Drivers search by different params", tags = {"Drivers"})
    @GetMapping
    List<DriverDto> getDriversByCriteria(
            @Parameter(description = "First name or last name contains letters") @RequestParam(required = false)
            String name,
            @Parameter(description = "Passport number contains number pattern") @RequestParam(required = false)
            Integer passport,
            @Parameter(description = "License type is") @RequestParam(required = false) String license,
            @Parameter(description = "Min age") @RequestParam(required = false) LocalDate minAge,
            @Parameter(description = "Max age") @RequestParam(required = false) LocalDate maxAge,
            @Parameter(description = "Min duration") @RequestParam(required = false) Duration minExperience,
            @Parameter(description = "Max duration") @RequestParam(required = false) Duration maxExperience,
            Pageable pageable);
}
