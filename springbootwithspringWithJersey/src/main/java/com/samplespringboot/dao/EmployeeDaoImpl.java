package com.samplespringboot.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.samplespringboot.dao.api.IEmployeeDao;
import com.samplespringboot.model.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Employee> getAllEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Override
	@Transactional
	public boolean saveEmployee(Employee employee) {
		try{
			hibernateTemplate.save(employee);
			return true;
		} catch(DataAccessException e) {
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteEmployeeByEmpId(String empId) {
		try{
			Employee employee = findByEmpId(empId);
			if(employee == null){
				return false;
			}
			hibernateTemplate.delete(employee);
			return true;
		} catch(DataAccessException e) {
			return false;
		}
	}

	@Override
	public Employee findByEmpId(String empId) {
		Employee employee = null;
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Employee.class);
		detachedCriteria.add(Restrictions.eq("empId", empId));
		List<Employee> listEmployee = (List<Employee>)hibernateTemplate.findByCriteria(detachedCriteria);
		if(listEmployee == null) {
			return employee;
		}
		if(listEmployee.size()>0) {
			employee = listEmployee.get(0);
		}
		return employee;
	}

}
