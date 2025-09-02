package com.paning.getallemployee.service;

import com.paning.getallemployee.model.Employee;
import com.paning.getallemployee.modeldto.getEmployeeDTO;
import com.paning.getallemployee.repository.IEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    private final IEmployeeRepository employeeRepository;

    public EmployeeService(IEmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    private getEmployeeDTO convertToDto(Employee employee){
        return new getEmployeeDTO(employee.getName());
    }

    @Override
    public List<getEmployeeDTO> getAllEmployee() {
        return employeeRepository.findAll().stream().map(this::convertToDto).toList();
    }
}
