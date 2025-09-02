package com.paning.getallemployee.controller;

import com.paning.getallemployee.modeldto.getEmployeeDTO;
import com.paning.getallemployee.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<getEmployeeDTO>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }
}
