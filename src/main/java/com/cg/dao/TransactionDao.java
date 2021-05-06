package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Transaction;

//dao layer for transaction

@Repository("transactionDao")
public interface TransactionDao extends JpaRepository<Transaction,Integer> {

}
