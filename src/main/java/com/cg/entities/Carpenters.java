package com.cg.entities;

import java.util.List;

public class Carpenters {

	private List<Carpenter> carpenterList;
	
	public Carpenters() {
	}

	public Carpenters(List<Carpenter> carpenters) {
		super();
		this.carpenterList = carpenters;
	}

	public List<Carpenter> getCarpenters() {
		return carpenterList;
	}

	public void setCarpenters(List<Carpenter> carpenters) {
		this.carpenterList = carpenters;
	}

	@Override
	public String toString() {
		return "Carpenters [carpenters=" + carpenterList + "]";
	}
}
