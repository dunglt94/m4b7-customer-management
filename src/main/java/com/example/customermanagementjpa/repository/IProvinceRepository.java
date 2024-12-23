package com.example.customermanagementjpa.repository;

import com.example.customermanagementjpa.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
