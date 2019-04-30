package com.samplespringboot.dao.api;

import java.util.List;

import com.samplespringboot.model.Address;

public interface IAddressDao {

	boolean saveAddressOfUser(String empId, Address address);
	
	List<Address> getAllAddressOfUser(String empId);	
}
