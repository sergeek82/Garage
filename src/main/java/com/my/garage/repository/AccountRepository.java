package com.my.garage.repository;

import com.my.garage.models.Account;
import com.my.garage.models.VehicleDriver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, VehicleDriver> {
}