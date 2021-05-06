package com.cg.entities;
import java.io.Serializable;
import java.util.List;



public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer customerId;
	private String customerName;
	private String phoneNumber;
	private String email;
	private String accountNumber;
	private String ifscCode;
	private Integer accountBalance;
	private List<Feedback> feedback;
	
	private Integer carpenterId;
	private List<Address> address;
	
	public Customer() {
	}

	public Customer(Integer customerId, String customerName, String phoneNumber, String email, String accountNumber,
			String ifscCode, Integer accountBalance, List<Feedback> feedback, Integer carpenterId,
			List<Address> address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.accountBalance = accountBalance;
		this.feedback = feedback;
		this.carpenterId = carpenterId;
		this.address = address;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Integer getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<Feedback> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}

	public Integer getCarpenterId() {
		return carpenterId;
	}

	public void setCarpenterId(Integer carpenterId) {
		this.carpenterId = carpenterId;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode
				+ ", accountBalance=" + accountBalance + ", feedback=" + feedback + ", carpenterId=" + carpenterId
				+ ", address=" + address + "]";
	}

}