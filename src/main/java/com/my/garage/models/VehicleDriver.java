package com.my.garage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name = "drivers")
@Getter
@Setter
@RequiredArgsConstructor
public class VehicleDriver {
    @OneToOne(mappedBy = "vehicleDriver")
    @PrimaryKeyJoinColumn
    Account account;

    @OneToMany(mappedBy = "vehicleDriver")
    private Collection<Vehicle> vehicleCollection;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer passportId;
    @Enumerated(value = EnumType.STRING)
    private LicenseType licenseType;
    private LocalDate birthDay;
    private LocalDate employment;

    enum LicenseType {
        A, B, C, D
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        VehicleDriver vehicleDriver = (VehicleDriver) o;
        return id.equals(vehicleDriver.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
