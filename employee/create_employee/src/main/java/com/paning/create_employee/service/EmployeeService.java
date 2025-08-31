package com.paning.create_employee.service;

import org.springframework.stereotype.Service;

import com.paning.create_employee.model.Employee;
import com.paning.create_employee.modeldto.CreateEmployeeDto;
import com.paning.create_employee.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
        
    }

    @Override
    public void createEmployee(CreateEmployeeDto createEmployeeDto) {
        Employee employee = new Employee();
        employee.setName(createEmployeeDto.getName());
        employeeRepository.save(employee);
    }


}
