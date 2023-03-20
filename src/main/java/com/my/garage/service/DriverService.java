package com.my.garage.service;

import com.my.garage.dto.DriverSearchQuery;
import com.my.garage.models.VehicleDriver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements GenericCRUD<VehicleDriver, DriverSearchQuery> {
    @Override
    public VehicleDriver add(VehicleDriver entity) {
        return null;
    }

    @Override
    public VehicleDriver getAll() {
        return null;
    }

    @Override
    public List<VehicleDriver> getByCriteria(DriverSearchQuery searchQuery) {
        return null;
    }

    @Override
    public VehicleDriver getById() {
        return null;
    }

    @Override
    public VehicleDriver update(VehicleDriver entity) {
        return null;
    }

    @Override
    public VehicleDriver remove(VehicleDriver entity) {
        return null;
    }
}
