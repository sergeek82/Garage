package com.my.garage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@RequiredArgsConstructor
public class Account {
    @Id
    @OneToOne
    @MapsId
    @JoinColumn(name = "driver_id")
    private VehicleDriver vehicleDriver;
    private BigDecimal amount;
}
