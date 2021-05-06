package com.cg.exceptions;

// custom excpetion for complain

public class ComplainNotFoundExcetpion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ComplainNotFoundExcetpion() {
	}
	
	public ComplainNotFoundExcetpion(String message)
	{
		super(message);
	}
}
