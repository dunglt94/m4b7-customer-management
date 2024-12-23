package com.example.customermanagementjpa.repository;

import com.example.customermanagementjpa.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProvinceRepository extends CrudRepository<Province, Long> {
}
