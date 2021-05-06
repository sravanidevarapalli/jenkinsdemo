package com.cg.services;

import java.util.List;

import com.cg.entities.Transaction;

public interface TransactionServices {

	public List<Transaction> addTransaction(Transaction t);

	public List<Transaction> updateTransaction(Transaction t);

	public List<Transaction> deleteTransaction(Integer transactionId);

	public Transaction getTransactionById(Integer transactionId);

	public List<Transaction> getAllTransactions();

}
