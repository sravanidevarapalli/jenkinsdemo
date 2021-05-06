package com.cg.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Survey;
import com.cg.entities.Surveys;
import com.cg.exceptions.ComplainNotFoundExcetpion;
import com.cg.exceptions.SurveyNotFoundException;
import com.cg.services.SurveyComplainMappingService;
import com.cg.services.SurveyServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//Survey controller will interact with the service layer

@RestController
@RequestMapping("/survey")
@Validated
@Api("An API for Survey Operations...!!!")
public class SurveyController {
	
private static final Logger logger = LoggerFactory.getLogger(SurveyController.class);
	
	// This annotation is used to create and handle the object automatically with the help of spring container
	@Autowired
	SurveyComplainMappingService surveyComplainMappingService;
	
	@Autowired
	SurveyServices surveyService;
	
	// find all survey stored in the database
	@GetMapping("/findAll")
	@ApiOperation(value="Get all Surveys")
	public Surveys getAllSurveys(){
		logger.info("In Survey Controller to retrieve all Surveys ..>!!!");
		
		return new Surveys(surveyService.getAllSurveys());		
	}
	
	//find specific survey with the help of id from the database
	@GetMapping("/find/{surveyId}")
	@ApiOperation(value="Get Survey based on id")
	public Survey getSurveyById(@PathVariable Integer surveyId) throws SurveyNotFoundException{
		logger.info("In Survey Controller to retrieve a Survey  by Id ..>!!!");
		 
		Survey survey = null;
		try{
			logger.info("Survey Id to be searched: "+surveyId);
			survey = surveyService.getSurveyById(surveyId);
		}catch(Exception exception) {
			logger.info("In catch block of getSurveyById() ...!");
			throw new SurveyNotFoundException("Enter valid Survey id ");
		}
		
		return survey;
		
	}
	
	// delete survey with specific id from the database
	@DeleteMapping("/delete/{surveyId}")
	@ApiOperation(value="Delete Survey based on id")
	public List<Survey> deleteSurvey(@PathVariable Integer surveyId) throws SurveyNotFoundException{
		logger.info("In Survey Controller to delete an Survey by Id ..>!!!");
		
		try{
			logger.info("Survey Id to be deleted: " +surveyId);
			 surveyService.getSurveyById(surveyId);
		}catch(Exception exception) {
			logger.info("In catch block of DeleteAdminById() ...!");
			throw new SurveyNotFoundException("Enter an existing  Survey id to be deleted  ");
		}
		
		return surveyService.deleteSurvey(surveyId);
	}
	
	//insert the survey record into the database
	@PostMapping("/insert")
	public List<Survey> addSurvey(@Valid Survey survey) throws Exception{
		logger.info("in Survey controller to insert Survey into db");
		
		try {
			return surveyService.addSurvey(survey);
		}
		catch (Exception exception) {
			throw new SurveyNotFoundException("binding error");
		}
	}
	
	//map the survey and complain table
	@GetMapping("/mapSurvey/{complainId}/{surveyId}") 
	public String bookCarpenter(@PathVariable Integer complainId,@PathVariable Integer surveyId) throws SurveyNotFoundException,ComplainNotFoundExcetpion
	{
		String returnValue = surveyComplainMappingService.mapSurvery(complainId,surveyId);
		if(returnValue.equals("Survey Not Found"))
		{
			throw new SurveyNotFoundException("Survey Not Found in database");
		}
		if(returnValue.equals("Complain Not Found"))
		{
			throw new ComplainNotFoundExcetpion("Complain Not Found in database");
		}
		return returnValue;
	}

}
