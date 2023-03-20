package com.my.garage.service;

import com.my.garage.dto.VehicleSearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GenericCRUD<T, S> {

    T add(T entity);

    T getAll();

    List<T> getByCriteria(S searchQuery);

    T getById();

    T update(T entity);

    T remove(T entity);
}
