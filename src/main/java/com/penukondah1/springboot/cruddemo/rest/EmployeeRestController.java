package com.penukondah1.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penukondah1.springboot.cruddemo.dao.EmployeeDAO;
import com.penukondah1.springboot.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeDAO employeeDAO;
	
	// inject employee dao
	@Autowired
	public EmployeeRestController (EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	// expose "/eployees" and return list of employees
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}
}
