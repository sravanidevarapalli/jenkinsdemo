package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

// transaction entity

@Entity
@Table(name="transaction")
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer transactionId;
	
	@NotBlank(message = "Transaction Type must not be blank")
	@Column(name = "type")
	private String transactionType;
	
	@NotBlank(message = "Transaction Date must not be blank")
	@Pattern(regexp = "([0-9]{2}/[0-9]{2}/[0-9]{4})", message ="Date should be in proper format")
	@Column(name = "date")
	private String transactionDate;
	
	@NotNull
	@Column(name="amount")
	private Integer transactionAmount;
	
	@NotBlank(message = "Bank Account Number is Mandatory")
	@Pattern(regexp="[0-9]{12}",message ="Invalid Bank Account Number")
	@Column(name = "account_from")
	private String accountFrom;
	
	@NotBlank(message = "Bank Account Number is Mandatory")
	@Pattern(regexp="[0-9]{12}",message ="Invalid Bank Account Number")
	@Column(name = "account_to")
	private String accountTo;
	
	
	public Transaction() {
	}


	public Transaction(Integer transactionId,
			@NotBlank(message = "Transaction Type must not be blank") String transactionType,
			@NotBlank(message = "Transaction Date must not be blank") @Pattern(regexp = "([0-9]{2}/[0-9]{2}/[0-9]{4})", message = "Date should be in proper format") String transactionDate,
			@NotNull Integer transactionAmount,
			@NotBlank(message = "Bank Account Number is Mandatory") @Pattern(regexp = "[0-9]{12}", message = "Invalid Bank Account Number") String accountFrom,
			@NotBlank(message = "Bank Account Number is Mandatory") @Pattern(regexp = "[0-9]{12}", message = "Invalid Bank Account Number") String accountTo) {
		super();
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
	}


	public Integer getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public String getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}


	public Integer getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(Integer transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public String getAccountFrom() {
		return accountFrom;
	}


	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}


	public String getAccountTo() {
		return accountTo;
	}


	public void setAccountTo(String accountTo) {
		this.accountTo = accountTo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionType=" + transactionType
				+ ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + ", accountFrom="
				+ accountFrom + ", accountTo=" + accountTo + "]";
	}
	
	
	
	
	

}
