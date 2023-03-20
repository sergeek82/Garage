package com.my.garage.service;

import com.my.garage.dto.VehicleSearchQuery;
import com.my.garage.models.Vehicle;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class VehicleService implements GenericCRUD<Vehicle, VehicleSearchQuery> {

    @Override
    public Vehicle add(Vehicle entity) {
        return null;
    }

    @Override
    public Vehicle getAll() {
        return null;
    }

    @Override
    public List<Vehicle> getByCriteria(VehicleSearchQuery searchQuery) {
        return null;
    }

    @Override
    public Vehicle getById() {
        return null;
    }

    @Override
    public Vehicle update(Vehicle entity) {
        return null;
    }

    @Override
    public Vehicle remove(Vehicle entity) {
        return null;
    }
}
