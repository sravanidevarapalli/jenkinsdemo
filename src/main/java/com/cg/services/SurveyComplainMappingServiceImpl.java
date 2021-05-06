package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.dao.SurveyComplainMappingDao;
import com.cg.entities.Complain;
import com.cg.entities.Complains;
import com.cg.entities.Survey;
import com.cg.entities.SurveyComplainMapping;
import com.cg.entities.Surveys;

// service layer for survey and complain mapping

@Service("SurveyComplainMappingService")
public class SurveyComplainMappingServiceImpl implements SurveyComplainMappingService{

	@Autowired
	RestTemplate rest;
	
	@Autowired
	SurveyComplainMappingDao surveyComplainMappingDao;
	
	
	// map survey with complain
	@Override
	public String mapSurvery(Integer complainId, Integer surveyId) {
		Surveys survey = rest.getForObject("http://admin-service/survey/findAll", Surveys.class);
		Complains complain = rest.getForObject("http://customer-service/complain/findAll", Complains.class);
		List<Survey> surveys = survey.getSurveys();
		List<Complain> complains = complain.getComplains();
		boolean isSurveyFound = false;
		for(Survey s: surveys)
		{
			if(s.getSurveyId() == surveyId)
			{
				isSurveyFound = true;
				break;
			}
		}
		if(!isSurveyFound)
		{
			return "Survey Not Found";
		}
		boolean isComplainFound = false;
		for(Complain c : complains)
		{
			if(c.getComplainId() == complainId)
			{
				isComplainFound = true;
				break;
			}
		}
		if(!isComplainFound)
		{
			return "Complain Not Found";
		}
		SurveyComplainMapping surveyComplainMapping = new SurveyComplainMapping(surveyId, complainId);
		surveyComplainMappingDao.saveAndFlush(surveyComplainMapping);
		return "Added: " + surveyComplainMapping;
	}

}
