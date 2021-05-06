package com.cg.entities;

import java.io.Serializable;

//address class

public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer addressId;
	private String area;
	private String city;
	private String state;
	private String pincode;
	
	private Integer custId;
	
	public Address() {
	}

	public Address(Integer addressId, String area, String city, String state, String pincode, Integer custId) {
		super();
		this.addressId = addressId;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.custId = custId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", custId=" + custId + "]";
	}
}
