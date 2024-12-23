package com.example.customermanagementjpa.service;

import com.example.customermanagementjpa.model.Customer;
import com.example.customermanagementjpa.model.Province;

import java.util.Optional;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
