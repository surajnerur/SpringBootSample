package com.samplespringboot.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.samplespringboot.bo.api.IAddressManager;
import com.samplespringboot.dao.api.IAddressDao;
import com.samplespringboot.model.Address;

public class AddressManager implements IAddressManager {

	@Autowired
	private IAddressDao iAddressDao;
	
	@Override
	public boolean saveAddressOfUser(String empId, Address address) {
		return iAddressDao.saveAddressOfUser(empId, address);
	}

	@Override
	public List<Address> getAllAddressOfUser(String empId) {
		return iAddressDao.getAllAddressOfUser(empId);
	}

}
