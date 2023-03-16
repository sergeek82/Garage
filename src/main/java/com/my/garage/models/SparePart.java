package com.my.garage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "spare_parts")
@Getter
@Setter
@RequiredArgsConstructor
public class SparePart {
    @ManyToOne
    @JoinColumn
    private Vehicle vehicle;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partNumber;
}
