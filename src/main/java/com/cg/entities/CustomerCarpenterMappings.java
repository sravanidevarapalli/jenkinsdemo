package com.cg.entities;

import java.util.List;

public class CustomerCarpenterMappings {
	private List<CustomerCarpenterMapping> list;
	
	public CustomerCarpenterMappings() {
	}

	public CustomerCarpenterMappings(List<CustomerCarpenterMapping> list) {
		super();
		this.list = list;
	}

	public List<CustomerCarpenterMapping> getList() {
		return list;
	}

	public void setList(List<CustomerCarpenterMapping> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "CustomerCarpenterMappings [list=" + list + "]";
	}
}
