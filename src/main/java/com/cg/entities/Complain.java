package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// complain entity

@Entity
@Table(name = "Complain")
public class Complain implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name ="id")
	@GeneratedValue
	private Integer complainId;
	private String complainDetails;

	public Complain() {
	}

	public Complain(Integer complainId, String complainDetails) {
		super();
		this.complainId = complainId;
		this.complainDetails = complainDetails;
	}

	public Integer getComplainId() {
		return complainId;
	}

	public void setComplainId(Integer complainId) {
		this.complainId = complainId;
	}

	public String getComplainDetails() {
		return complainDetails;
	}

	public void setComplainDetails(String complainDetails) {
		this.complainDetails = complainDetails;
	}

	@Override
	public String toString() {
		return "Complain [complainId=" + complainId + ", complainDetails=" + complainDetails + ", feedback=" + "]";
	}
}
