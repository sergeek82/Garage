package com.my.garage.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link com.my.garage.models.Account} entity
 */
@Data
@Builder
public class AccountDto implements Serializable {
    private final Long driverId;
    private final BigDecimal amount;
}