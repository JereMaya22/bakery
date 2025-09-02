package com.paning.getallemployee.service;

import com.paning.getallemployee.modeldto.getEmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<getEmployeeDTO> getAllEmployee();
}
