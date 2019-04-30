package com.samplespringboot.dao;

import java.util.List;

import com.samplespringboot.dao.api.IEmployeeDao;
import com.samplespringboot.model.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeByEmpId(String empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee findByEmpId(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
