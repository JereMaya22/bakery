package com.paning.editemployee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paning.editemployee.modeldto.EditEmployee;
import com.paning.editemployee.service.EmployeeService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PutMapping("/edit")
    public ResponseEntity<String> updateEmployee(@RequestBody EditEmployee editEmployee ){
        employeeService.editEmployee(editEmployee);
        return ResponseEntity.ok("Employee updated successfully");
    }
}
