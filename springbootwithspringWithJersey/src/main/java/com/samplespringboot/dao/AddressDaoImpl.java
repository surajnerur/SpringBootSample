package com.samplespringboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.samplespringboot.dao.api.IAddressDao;
import com.samplespringboot.model.Address;

public class AddressDaoImpl implements IAddressDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public boolean saveAddressOfUser(String empId, Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Address> getAllAddressOfUser(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
