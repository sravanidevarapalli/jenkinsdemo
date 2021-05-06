package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SurveyComplainMapping {

	@Id
	private Integer surveyId;
	private Integer complainId;
	
	public SurveyComplainMapping() {
	}

	public SurveyComplainMapping(Integer surveyId, Integer complainId) {
		super();
		this.surveyId = surveyId;
		this.complainId = complainId;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public Integer getComplainId() {
		return complainId;
	}

	public void setComplainId(Integer complainId) {
		this.complainId = complainId;
	}

	@Override
	public String toString() {
		return "SurveyComplainMapping [surveyId=" + surveyId + ", complainId=" + complainId + "]";
	}
	
}
