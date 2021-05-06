package com.cg.exceptions;

// custom exception for survey

public class SurveyNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SurveyNotFoundException() {
	}
	
	public SurveyNotFoundException(String message) {
		super(message);
		
		
	}
	

}

