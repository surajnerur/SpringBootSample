package com.samplespringboot.dao.api;

import java.util.List;

import com.samplespringboot.model.Employee;

public interface IEmployeeDao {
	
	List<Employee> getAllEmployees();
	
	boolean saveEmployee(Employee employee);
	
	boolean deleteEmployeeByEmpId(String empId);
	
	Employee findByEmpId(String empId);
}
