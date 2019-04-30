package com.samplespringboot.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samplespringboot.bo.api.IEmployeeManager;
import com.samplespringboot.dao.api.IEmployeeDao;
import com.samplespringboot.model.Employee;

@Service
public class EmployeeManager implements IEmployeeManager {

	@Autowired
	private IEmployeeDao iEmployeeDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		return iEmployeeDao.getAllEmployees();
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		try {
			return iEmployeeDao.saveEmployee(employee);
		} catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeByEmpId(String empId) {
		try {
			return iEmployeeDao.deleteEmployeeByEmpId(empId);
		} catch(Exception e) {
			return false;
		}
		
	}

	@Override
	public Employee findByEmpId(String empId) {
		return iEmployeeDao.findByEmpId(empId);
	}

}
