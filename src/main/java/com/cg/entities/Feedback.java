package com.cg.entities;

import java.io.Serializable;

public class Feedback implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer feedbackId;
	private Integer custId;
	private String rating;
	private String isSatisfied;
	private Complain complain;
	
	public Feedback() {
	}

	public Feedback(Integer feedbackId, Integer custId, String rating, String isSatisfied, Complain complain) {
		super();
		this.feedbackId = feedbackId;
		this.custId = custId;
		this.rating = rating;
		this.isSatisfied = isSatisfied;
		this.complain = complain;
	}

	public Integer getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getIsSatisfied() {
		return isSatisfied;
	}

	public void setIsSatisfied(String isSatisfied) {
		this.isSatisfied = isSatisfied;
	}

	public Complain getComplain() {
		return complain;
	}

	public void setComplain(Complain complain) {
		this.complain = complain;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", custId=" + custId + ", rating=" + rating + ", isSatisfied="
				+ isSatisfied + ", complain=" + complain + "]";
	}
}
