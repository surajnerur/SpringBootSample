package com.samplespringboot.bo.api;

import java.util.List;

import com.samplespringboot.model.Employee;

public interface IEmployeeManager {

	List<Employee> getAllEmployees();
	
	boolean saveEmployee(Employee employee);
	
	boolean deleteEmployeeByEmpId(String empId);
	
	Employee findByEmpId(String empId);	
}
