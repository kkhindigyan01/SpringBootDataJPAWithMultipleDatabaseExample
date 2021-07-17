package com.kkhindigyan.app.emp.dao;

import org.springframework.data.repository.CrudRepository;

import com.kkhindigyan.app.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
