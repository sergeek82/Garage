package com.my.garage.repository;

import com.my.garage.models.VehicleDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DriverRepository extends JpaRepository<VehicleDriver, Long>, JpaSpecificationExecutor<VehicleDriver> {
}
