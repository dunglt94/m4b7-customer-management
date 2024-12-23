package com.example.customermanagementjpa.service;

import com.example.customermanagementjpa.model.Customer;

import java.util.List;
import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T Object);

    void remove(Long id);
}
