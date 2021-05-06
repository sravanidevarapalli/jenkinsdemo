package com.cg.entities;

import java.util.List;

public class Customers {

	private List<Customer> customerList;
	
	public Customers() {
	}

	public Customers(List<Customer> customers) {
		super();
		this.customerList = customers;
	}

	public List<Customer> getCustomers() {
		return customerList;
	}

	public void setCustomers(List<Customer> customers) {
		this.customerList = customers;
	}

	@Override
	public String toString() {
		return "Customers [customers=" + customerList + "]";
	}
}
