package com.samplespringboot.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.samplespringboot.dao.api.IAddressDao;
import com.samplespringboot.dao.api.IEmployeeDao;
import com.samplespringboot.model.Address;
import com.samplespringboot.model.Employee;

@Repository
public class AddressDaoImpl implements IAddressDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private IEmployeeDao employeeDao;
	
	@Override
	public boolean saveAddressOfUser(String empId, Address address) {
		Employee employee = employeeDao.findByEmpId(empId);
		employee.getListOfAddress().add(address);
		hibernateTemplate.save(employee);
		return true;
	}

	@Override
	public List<Address> getAllAddressOfUser(String empId) {
		/*Employee employee = employeeDao.findByEmpId(empId);
		return ( List<Address>)employee.getListOfAddress();
				OR
		*/
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Address.class);
		detachedCriteria.add(Restrictions.eq("emplyoee_empid", empId));
		List<Address> listAddress = (List<Address>)hibernateTemplate.findByCriteria(detachedCriteria);
		return listAddress;
	}

}
