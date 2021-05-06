package com.cg.entities;

import java.util.List;

public class Surveys {

	private List<Survey> surveyList;
	
	public Surveys() {
	}

	public Surveys(List<Survey> surveys) {
		super();
		this.surveyList = surveys;
	}

	public List<Survey> getSurveys() {
		return surveyList;
	}

	public void setSurveys(List<Survey> surveys) {
		this.surveyList = surveys;
	}

	@Override
	public String toString() {
		return "Surveys [surveys=" + surveyList + "]";
	}
	
}
