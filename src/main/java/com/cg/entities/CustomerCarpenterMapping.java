package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerCarpenterMapping {
	@Id
	private Integer customerId;
	private Integer carpenterId;
	
	public CustomerCarpenterMapping() {
	}

	public CustomerCarpenterMapping(Integer customerId, Integer carpenterId) {
		super();
		this.customerId = customerId;
		this.carpenterId = carpenterId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCarpenterId() {
		return carpenterId;
	}

	public void setCarpenterId(Integer carpenterId) {
		this.carpenterId = carpenterId;
	}

	@Override
	public String toString() {
		return "CustomerCarpenterMapping [customerId=" + customerId + ", carpenterId=" + carpenterId + "]";
	}
}
