package com.samplespringboot.bo.api;

import java.util.List;

import com.samplespringboot.model.Address;

public interface IAddressManager {

	boolean saveAddressOfUser(String empId, Address address);
	
	List<Address> getAllAddressOfUser(String empId);	
}
