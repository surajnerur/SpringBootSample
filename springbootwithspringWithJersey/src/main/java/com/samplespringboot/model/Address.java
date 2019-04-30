package com.samplespringboot.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String houseNo;
	private String street;
	private String area;
	private String city;
	private String state;
	private String pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String houseNo, String street, String area, String city, String state, String pincode) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}	
}
