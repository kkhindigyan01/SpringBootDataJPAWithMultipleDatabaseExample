package com.kkhindigyan.app.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkhindigyan.app.emp.dao.EmployeeRepository;
import com.kkhindigyan.app.employee.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee createEmpoyee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Iterable<Employee> fetchAllEmployees(){
		return employeeRepository.findAll();
	}
}
