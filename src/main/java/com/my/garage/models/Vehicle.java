package com.my.garage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "vehicles", indexes = {
        @Index(name = "v_index", columnList = "vin", unique = true),
        @Index(name = "lp_index", columnList = "license_plate", unique = true)
})
@Getter
@Setter
@NoArgsConstructor
public class Vehicle {

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private VehicleDriver vehicleDriver;
    @ManyToMany
    @JoinTable(name = "vehicle_part", joinColumns = @JoinColumn(name = "vehicle_id"),
            inverseJoinColumns = @JoinColumn(name = "part_id"))
    private Set<SparePart> spareParts;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "vin")
    private String vin;
    @Column(name = "license_plate")
    private String licensePlate;
    @Column(name = "model")
    private String model;
    @Column(name = "manufacture")
    private String manufacture;
    @Column(name = "production_date")
    private LocalDate productionDate;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
            return false;
        Vehicle vehicle = (Vehicle) o;
        return id != null && Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
