package com.paning.editemployee.service;

import org.springframework.stereotype.Service;

import com.paning.editemployee.exception.EmployeeNotFoundException;
import com.paning.editemployee.exception.invalidEmployeeDataException;
import com.paning.editemployee.model.Employee;
import com.paning.editemployee.modeldto.EditEmployee;
import com.paning.editemployee.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{

    private final IEmployeeRepository employeeRepository;

    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private Employee covertToModel(EditEmployee editEmployee) {
        return new Employee(editEmployee.getId(), editEmployee.getName());
    }

    @Override
    public EditEmployee editEmployee(EditEmployee editEmployee) {

        if(editEmployee.getId() == null || editEmployee.getId() <= 0) {
            throw new invalidEmployeeDataException("Employee ID cannot be null");
        }

        if(editEmployee.getName() == null || editEmployee.getName().isBlank()) {
            throw new invalidEmployeeDataException("Employee name cannot be null");
        }

        if(!employeeRepository.existsById(editEmployee.getId())){
            throw new EmployeeNotFoundException("Employee with ID " + editEmployee.getId() + " does not exist");
        }

        Employee employee = covertToModel(editEmployee);
        employeeRepository.save(employee);
        return editEmployee;
    }

}
