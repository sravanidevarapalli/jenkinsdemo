package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

// carpenter entity

@Entity
@Table(name="carpenter")
public class Carpenter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="id")
	@GeneratedValue()
	private Integer carpenterId;
	
	@NotBlank(message="Carpenter name must be mandatory")
	@Column(name = "name")
	@Size(min=3,max=30,message="carpenter name is in between 3-30 characters")
	private String carpenterName;
	
	@Email(message = "Email should be valid")
	@Column(name = "email",unique = true)
	private String carpenterEmail;
	
	@NotBlank(message = "Phone Number is Mandatory")
	@Pattern(regexp="[0-9]{10}",message ="Invalid Phone Number")
	@Column(name = "phone",unique = true)
	private String carpenterPhoneno;
	
	@NotBlank(message = "Bank Name is Mandatory")
	@Column(name = "bank")
	private String carpenterBank;
	
	
	@NotBlank(message = "Bank Account Number is Mandatory")
	@Pattern(regexp="[0-9]{12}",message ="Invalid Bank Account Number")
	@Column(name = "account",unique = true)
	private String carpenterAccno; 
	
	@NotBlank(message = "IFSC number is Mandatory")
	@Pattern(regexp="[0-9A-Za-z]{11}",message ="Invalid Bank Account Number")
	@Column(name = "ifsc")
	private String carpenterIFSC;
	
	@Column(name = "balance")
	private Integer carpenterBalance;
	
	@NotBlank(message="Satus should not be blank")
	private String carpenterStatus;
	
	private String skills;

	public Carpenter() {
		super();
	}

	public Carpenter(Integer carpenterId,
			@NotBlank(message = "Carpenter name must be mandatory") @Size(min = 3, max = 30, message = "carpenter name is in between 3-30 characters") String carpenterName,
			@Email(message = "Email should be valid") String carpenterEmail,
			@NotBlank(message = "Phone Number is Mandatory") @Pattern(regexp = "[0-9]{10}", message = "Invalid Phone Number") String carpenterPhoneno,
			@NotBlank(message = "Bank Name is Mandatory") String carpenterBank,
			@NotBlank(message = "Bank Account Number is Mandatory") @Pattern(regexp = "[0-9]{12}", message = "Invalid Bank Account Number") String carpenterAccno,
			@NotBlank(message = "IFSC number is Mandatory") @Pattern(regexp = "[0-9A-Za-z]{11}", message = "Invalid Bank Account Number") String carpenterIFSC,
			Integer carpenterBalance, @NotBlank(message = "Satus should not be blank") String carpenterStatus,
			String skills) {
		super();
		this.carpenterId = carpenterId;
		this.carpenterName = carpenterName;
		this.carpenterEmail = carpenterEmail;
		this.carpenterPhoneno = carpenterPhoneno;
		this.carpenterBank = carpenterBank;
		this.carpenterAccno = carpenterAccno;
		this.carpenterIFSC = carpenterIFSC;
		this.carpenterBalance = carpenterBalance;
		this.carpenterStatus = carpenterStatus;
		this.skills = skills;
	}

	public Integer getCarpenterId() {
		return carpenterId;
	}

	public void setCarpenterId(Integer carpenterId) {
		this.carpenterId = carpenterId;
	}

	public String getCarpenterName() {
		return carpenterName;
	}

	public void setCarpenterName(String carpenterName) {
		this.carpenterName = carpenterName;
	}

	public String getCarpenterEmail() {
		return carpenterEmail;
	}

	public void setCarpenterEmail(String carpenterEmail) {
		this.carpenterEmail = carpenterEmail;
	}

	public String getCarpenterPhoneno() {
		return carpenterPhoneno;
	}

	public void setCarpenterPhoneno(String carpenterPhoneno) {
		this.carpenterPhoneno = carpenterPhoneno;
	}

	public String getCarpenterBank() {
		return carpenterBank;
	}

	public void setCarpenterBank(String carpenterBank) {
		this.carpenterBank = carpenterBank;
	}

	public String getCarpenterAccno() {
		return carpenterAccno;
	}

	public void setCarpenterAccno(String carpenterAccno) {
		this.carpenterAccno = carpenterAccno;
	}

	public String getCarpenterIFSC() {
		return carpenterIFSC;
	}

	public void setCarpenterIFSC(String carpenterIFSC) {
		this.carpenterIFSC = carpenterIFSC;
	}

	public Integer getCarpenterBalance() {
		return carpenterBalance;
	}

	public void setCarpenterBalance(Integer carpenterBalance) {
		this.carpenterBalance = carpenterBalance;
	}

	public String getCarpenterStatus() {
		return carpenterStatus;
	}

	public void setCarpenterStatus(String carpenterStatus) {
		this.carpenterStatus = carpenterStatus;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Carpenter [carpenterId=" + carpenterId + ", carpenterName=" + carpenterName + ", carpenterEmail="
				+ carpenterEmail + ", carpenterPhoneno=" + carpenterPhoneno + ", carpenterBank=" + carpenterBank
				+ ", carpenterAccno=" + carpenterAccno + ", carpenterIFSC=" + carpenterIFSC + ", carpenterBalance="
				+ carpenterBalance + ", carpenterStatus=" + carpenterStatus + ", skills=" + skills + "]";
	}
}
