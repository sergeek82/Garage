package com.my.garage.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/drivers")
@Tag(name = "Vehicles", description = "EndPoints related to vehicles")
public interface VehicleApi {
}
