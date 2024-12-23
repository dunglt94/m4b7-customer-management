package com.example.customermanagementjpa.service;

import com.example.customermanagementjpa.model.Customer;
import com.example.customermanagementjpa.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
}
