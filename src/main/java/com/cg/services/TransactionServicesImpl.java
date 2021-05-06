package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TransactionDao;
import com.cg.entities.Transaction;

// service layer implementation for transaction

@Service("transactionService")
public class TransactionServicesImpl implements TransactionServices {
	
	private static final Logger logger = LoggerFactory.getLogger(TransactionServicesImpl.class);
	
	@Autowired
	TransactionDao transactionDao;
	
	// inserting transaction to Postgres DB
		@Override
		public List<Transaction> addTransaction(Transaction t) {
			
			logger.info("Inserting a transaction ...");
			transactionDao.saveAndFlush(t);
			return transactionDao.findAll();
		}
		
		
		// updating transaction to Postgres DB
		@Override
		public List<Transaction> updateTransaction(Transaction t) {
			
			logger.info("Updating a transaction ...");
			transactionDao.save(t);
			return transactionDao.findAll();
		}
		
		
		// deleting transaction from Postgres DB
		@Override
		public List<Transaction> deleteTransaction(Integer transactionId) {
			
			logger.info("Delete a transaction using transactionId ...");
			transactionDao.deleteById(transactionId);
			return transactionDao.findAll(); 
		}
		
		
		// Retrieving transaction by id from Postgres DB
		@Override
		public Transaction getTransactionById(Integer transactionId) {
			
			logger.info("Retrieve a transaction by Id ...");
			Optional<Transaction> t =  transactionDao.findById(transactionId);
			if (t.isPresent())
				//if present it will give value	
				return t.get();
			else
				return null;
		}
		
		
		// Retrieving all transactions from Postgres DB
		@Override
		public List<Transaction> getAllTransactions() {
			logger.info("Retrieve all transactions ...!!");
			return transactionDao.findAll();
		}
}
