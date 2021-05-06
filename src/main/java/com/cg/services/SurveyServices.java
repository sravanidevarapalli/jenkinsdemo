package com.cg.services;

import java.util.List;

import com.cg.entities.Survey;


public interface SurveyServices {
	
	public List<Survey> addSurvey(Survey s);

	public List<Survey> updateSurvey(Survey s);

	public List<Survey> deleteSurvey(Integer surveyId);

	public Survey getSurveyById(Integer surveyId);

	public List<Survey> getAllSurveys();


}
