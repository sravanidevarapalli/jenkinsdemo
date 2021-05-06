package com.cg.entities;

import java.util.List;

public class SurveyComplainMappings {

	private List<SurveyComplainMapping> surveyComplainMappingList;
	
	public SurveyComplainMappings() {
	}

	public SurveyComplainMappings(List<SurveyComplainMapping> surveyComplainMappings) {
		super();
		this.surveyComplainMappingList = surveyComplainMappings;
	}

	public List<SurveyComplainMapping> getSurveyComplainMappings() {
		return surveyComplainMappingList;
	}

	public void setSurveyComplainMappings(List<SurveyComplainMapping> surveyComplainMappings) {
		this.surveyComplainMappingList = surveyComplainMappings;
	}

	@Override
	public String toString() {
		return "SurveyComplainMappings [surveyComplainMappings=" + surveyComplainMappingList + "]";
	}

}
