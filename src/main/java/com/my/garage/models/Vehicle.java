package com.my.garage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
@NoArgsConstructor
public class Vehicle {

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private VehicleDriver vehicleDriver;
    @OneToMany(mappedBy = "vehicle")
    private Collection<SparePart> spareParts;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vin;
    private String licensePlate;
    private Integer passportId;
    private String model;
    private String manufacture;
    private Integer production;
}
