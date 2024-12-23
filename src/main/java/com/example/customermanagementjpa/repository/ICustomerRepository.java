package com.example.customermanagementjpa.repository;

import com.example.customermanagementjpa.model.Customer;
import com.example.customermanagementjpa.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
