package com.my.garage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    private Long id;
    @OneToOne
    @MapsId()
    @JoinColumn(name = "driver_id")
    private VehicleDriver vehicleDriver;
    private BigDecimal amount;
}
