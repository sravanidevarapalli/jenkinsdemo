package com.cg.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

//Global Exception Handler

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	//admin not found
	@ExceptionHandler(AdminNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorInfo handleAdmninNotFoundException(AdminNotFoundException e, HttpServletRequest request) {
		
		logger.info("In controller advice to find the AdminId");
		
		ErrorInfo error = new ErrorInfo();    // create instance of ErrorInfo
		error.setUrl(request.getRequestURI());   
		error.setMessage(e.getMessage()); 
		
		return error;
	}

	//survey not found
	@ExceptionHandler(SurveyNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorInfo handleSurveyNotFoundException(SurveyNotFoundException e, HttpServletRequest request) {
		
		logger.info("In controller advice to find the SurveyId");
		
		ErrorInfo error = new ErrorInfo();    // create instance of ErrorInfo
		error.setUrl(request.getRequestURI());   
		error.setMessage(e.getMessage()); 
		
		return error;
	}
	
	//transaction not found
	@ExceptionHandler(TransactionNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorInfo handleTransactionNotFoundException(TransactionNotFoundException e, HttpServletRequest request) {
		
		logger.info("In controller advice to find theTransactionId");
		
		ErrorInfo error = new ErrorInfo();    // create instance of ErrorInfo
		error.setUrl(request.getRequestURI());   
		error.setMessage(e.getMessage()); 
		
		return error;
	}
	
	// binding exception because of validation
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BindException.class)
	public ResponseEntity<String> handleBindException(BindException e)
	{
		return new ResponseEntity<>("Bind error on path paramter", HttpStatus.BAD_REQUEST);
	}
	
	// customer not found
	@ExceptionHandler(CustomerNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorInfo handleCustomerNotFoundException(CustomerNotFoundException e, HttpServletRequest request) {
		
		
		ErrorInfo error = new ErrorInfo();    // create instance of ErrorInfo
		error.setUrl(request.getRequestURI());   
		error.setMessage(e.getMessage()); 
		
		return error;
	}
	
	// carpenter not found
	@ExceptionHandler(CarpenterNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorInfo handleCarpenterNotFoundException(CarpenterNotFoundException e, HttpServletRequest request) {
		
		ErrorInfo error = new ErrorInfo();    // create instance of ErrorInfo
		error.setUrl(request.getRequestURI());   
		error.setMessage(e.getMessage()); 
		
		return error;
	}
	
	// complain not found
	@ExceptionHandler(ComplainNotFoundExcetpion.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorInfo handleComplainNotFoundException(ComplainNotFoundExcetpion e, HttpServletRequest request) {
		
		ErrorInfo error = new ErrorInfo();    // create instance of ErrorInfo
		error.setUrl(request.getRequestURI());   
		error.setMessage(e.getMessage()); 
		
		return error;
	}
}

