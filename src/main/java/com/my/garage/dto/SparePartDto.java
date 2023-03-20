package com.my.garage.dto;

import com.my.garage.models.SparePart;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link SparePart} entity
 */
@Data
@Builder
public class SparePartDto implements Serializable {
    private final Long id;
    private final String partNumber;
}