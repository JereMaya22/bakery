package com.paning.editemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paning.editemployee.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{

}
