package com.kkhindigyan.app;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kkhindigyan.app.emp.dao.EmployeeRepository;
import com.kkhindigyan.app.emp.service.EmployeeService;
import com.kkhindigyan.app.employee.entities.Employee;
import com.kkhindigyan.app.user.dao.UserRepository;
import com.kkhindigyan.app.user.entities.User;
import com.kkhindigyan.app.user.service.UserService;

@SpringBootApplication
public class SpringBootDataJpaWithMultipleDatabaseExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDataJpaWithMultipleDatabaseExampleApplication.class, args);
		
		System.out.println("Creating & Reading User information using MySQL Database..");
		UserService userService = applicationContext.getBean(UserService.class);
		userService.createUser(getUser());
		userService.fetchAllUsers().forEach(System.out::println);
		
		System.out.println("--------------------------------------------------");
	
		System.out.println("Creating & Reading Employee information using Oracle Database..");
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		employeeService.createEmpoyee(getEmployee());
		employeeService.fetchAllEmployees().forEach(System.out::println);
		
	}
	
	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Sean");
		employee.setEmail("sean.cs@gmail.com");
		employee.setDoj(new Date());
		employee.setSalary(99000.00);
		return employee;
	}
	
	private static User getUser() {
		User user = new User();
		user.setName("KK");
		user.setAge(32);
		user.setDob(LocalDate.of(1990, Month.DECEMBER, 10));
		return user;
	}
}
