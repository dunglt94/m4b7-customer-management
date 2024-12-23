package com.example.customermanagementjpa.repository;

import com.example.customermanagementjpa.model.Customer;
import com.example.customermanagementjpa.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);

    Page<Customer> findAll(Pageable pageable);

}
