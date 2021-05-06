package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.SurveyDao;
import com.cg.entities.Survey;

// service layer implementation for survey

@Service("surveyService")
public class SurveyServicesImpl implements SurveyServices {
	
private static final Logger logger = LoggerFactory.getLogger(SurveyServicesImpl.class);
	
	@Autowired
	SurveyDao surveyDao;
	
	// inserting Survey to postgres database
		@Override
		public List<Survey> addSurvey(Survey s) {
			
			logger.info("Inserting a Survey ...");
			surveyDao.saveAndFlush(s);
			return surveyDao.findAll();
		}
		
		
		// updating Survey to postgres DB
		@Override
		public List<Survey> updateSurvey(Survey s) {
			
			logger.info("Updating a Survey ...");
			surveyDao.save(s);
			return surveyDao.findAll();
		}
		
		
		// deleting Survey from postgres DB
		@Override
		public List<Survey> deleteSurvey(Integer surveyId) {
			
			logger.info("Delete a Survey using transactionId ...");
			surveyDao.deleteById(surveyId);
			return surveyDao.findAll(); 
		}
		
		
		// Retrieving Survey by id from postgres DB
		@Override
		public Survey getSurveyById(Integer surveyId) {
			
			logger.info("Retrieve a Survey by Id ...");
			Optional<Survey> s =  surveyDao.findById(surveyId);// if present it will give value	
			if(s.isPresent())
				return s.get();
			else
				return null;
		}
		
		
		// Retrieving all surveys from postgres DB
		@Override
		public List<Survey> getAllSurveys() {
			logger.info("Retrieve all Surveys ...!!");
			return surveyDao.findAll();
		}
}
