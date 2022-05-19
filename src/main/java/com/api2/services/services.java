package com.api2.services;

import java.util.List;

import com.api2.models.Employee;
import com.api2.repository.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class services {
    

    @Autowired
    repository repository;

    public List<Employee> listarEmployee(){
        return (List<Employee>)repository.findAll();
    }
}
