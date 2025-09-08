package com.paning.deleteemployee.service;

import org.springframework.stereotype.Service;

import com.paning.deleteemployee.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{

    private final IEmployeeRepository employeeRepository;

    public EmployeeService(IEmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void deleteemployee(Long id) {

        if(!employeeRepository.existsById(id)){
            throw new RuntimeException("Employee Not Found");
        }

        employeeRepository.deleteById(id);
    }
}
