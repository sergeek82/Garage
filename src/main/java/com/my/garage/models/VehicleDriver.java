package com.my.garage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name = "drivers", indexes = {
        @Index(name = "pass_index", columnList = "passport", unique = true),
        @Index(name = "fn_ln_index", columnList = "first_name, last_name"),
        @Index(name = "ln_fn_index", columnList = "last_name, first_name"),
        @Index(name = "ln_ndex", columnList = "last_name"),
        @Index(name = "fn_ndex", columnList = "first_name")
})
@Getter
@Setter
@NoArgsConstructor
public class VehicleDriver {
    @OneToOne(mappedBy = "vehicleDriver")
    @PrimaryKeyJoinColumn
    Account account;

    @OneToMany(mappedBy = "vehicleDriver")
    private Collection<Vehicle> vehicleCollection;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "passport")
    private Integer passportId;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "license_type")
    private LicenseType licenseType;
    @Column(name = "birthday")
    private LocalDate birthDay;
    @Column(name = "employment_date")
    private LocalDate employment;

  public enum LicenseType {
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
