package com.api2.repository;

import com.api2.models.Employee;

import org.springframework.data.repository.CrudRepository;

public interface repository  extends CrudRepository<Employee,Integer>{
    
}
