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

import com.cg.entities.Transaction;
import com.cg.exceptions.TransactionNotFoundException;
import com.cg.services.TransactionServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

// Transaction controller is used to interact with service layer of transactions

@RestController
@RequestMapping("/transaction")
@Validated
@Api("An API for Transaction Operations...!!!")
public class TransactionController {
	
private static final Logger logger = LoggerFactory.getLogger(TransactionController.class);
	
	//Create and handling of object done by spring container using this annotation
	@Autowired
	TransactionServices transactionService;
	
	//find all the transaction from the database
	@GetMapping("/findAll")
	@ApiOperation(value="Get all Transaction ")
	public List<Transaction> getAllTransactions(){
		logger.info("In Transaction Controller to retrieve all Transactions ..>!!!");
		
		return transactionService.getAllTransactions();		
	}
	
	//find transaction with specific id from the database
	@GetMapping("/find/{transactionId}")
	@ApiOperation(value="Get Transaction based on id")
	public Transaction getTransactionById(@PathVariable Integer transactionId) throws TransactionNotFoundException{
		logger.info("In Transaction Controller to retrieve an Transaction  by Id ..>!!!");
		
		Transaction transaction = null;
		try{
			logger.info("Transaction Id to be searched: "+transactionId);
			transaction = transactionService.getTransactionById(transactionId);
		}catch(Exception exception) {
			logger.info("In catch block of getTransactionById() ...!");
			throw new TransactionNotFoundException("Enter valid Transaction id ");
		}
		
		return transaction;
		
	}
	
	// delete transaction with specific id from the database
	@DeleteMapping("/delete/{transactionId}")
	@ApiOperation(value="Delete Transaction based on id")
	public List<Transaction> deleteTransaction(@PathVariable Integer transactionId) throws TransactionNotFoundException{
		logger.info("In Transaction Controller to delete an Transaction by Id ..>!!!");
		

		try{
			logger.info("Transaction Id to be deleted: "+transactionId);
			 transactionService.getTransactionById(transactionId);
		}catch(Exception exception) {
			logger.info("In catch block of DeleteAdminById() ...!");
			throw new TransactionNotFoundException("Enter an existing  Transaction id to be deleted  ");
		}
		
		return transactionService.deleteTransaction(transactionId);
	}
	
	// insert transaction into the database
	@PostMapping("/insert")
	public List<Transaction> addTransaction(@Valid Transaction transaction) throws Exception{
		logger.info("in Transaction controller to insert Transaction into db");
		
		try {
			return transactionService.addTransaction(transaction);
		}
		catch (Exception exception) {
			throw new TransactionNotFoundException("binding error");
		}
	
	}
}
