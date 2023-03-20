package com.my.garage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "parts")
@Getter
@Setter
@NoArgsConstructor
public class SparePart {
    @ManyToMany(mappedBy = "spareParts")
    private Set<Vehicle> vehicles;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partNumber;
}
