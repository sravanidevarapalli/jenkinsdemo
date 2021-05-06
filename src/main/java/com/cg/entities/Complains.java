package com.cg.entities;

import java.util.List;

public class Complains {
	
	private List<Complain> complainList;
		
	public Complains() {
	}

	public Complains(List<Complain> complains) {
		super();
		this.complainList = complains;
	}

	public List<Complain> getComplains() {
		return complainList;
	}

	public void setComplains(List<Complain> complains) {
		this.complainList = complains;
	}

	@Override
	public String toString() {
		return "Complains [complains=" + complainList + "]";
	}
}
