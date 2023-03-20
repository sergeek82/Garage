package com.my.garage.mapper;

import com.my.garage.dto.DriverDto;
import com.my.garage.models.VehicleDriver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    DriverDto toDto(VehicleDriver vehicleDriver);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "account", ignore = true)
    @Mapping(target = "vehicleCollection",ignore = true)
    VehicleDriver toEntity(DriverDto driverDto);

    List<DriverDto> toDtoList(List<VehicleDriver> list);
}
