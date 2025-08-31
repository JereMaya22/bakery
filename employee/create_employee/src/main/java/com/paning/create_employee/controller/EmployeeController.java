package com.paning.create_employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.paning.create_employee.modeldto.CreateEmployeeDto;
import com.paning.create_employee.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    

    @PostMapping("/create")    
    public ResponseEntity<String> createEmployee(@RequestBody CreateEmployeeDto createEmployeeDto){
        employeeService.createEmployee(createEmployeeDto);
        return ResponseEntity.ok("Employee created successfully");
    }

}
