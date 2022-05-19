package com.api2.controllers;

import java.util.List;

import com.api2.models.Employee;
import com.api2.services.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
    

    @Autowired
    services services;


    @GetMapping("/Employee")
    public List<Employee> listarCanciones(){
        return services.listarEmployee();
    }
}
