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

// admin entity

@Entity
@Table(name="admin" )
public class Admin implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer adminId;
	
	@NotBlank(message = "Admin Name must not be blank")
	@Pattern(regexp = "[A-Za-z ]*", message ="Name should contain only characters")
	@Column(name = "name")
	private String adminName;
	
	@Email(message = "Email should be valid")
	@Column(name = "email",unique = true)
	private String adminEmail;
	
	
	@NotBlank(message = "Phone Number is Mandatory")
	@Pattern(regexp="[0-9]{10}",message ="Invalid Phone Number")
	@Column(name = "phone",unique = true)
	private String adminPhone;
	
	@NotBlank(message = "Bank Name is Mandatory")
	@Column(name = "bank")
	private String adminBank;
	
	
	@NotBlank(message = "Bank Account Number is Mandatory")
	@Pattern(regexp="[0-9]{12}",message ="Invalid Bank Account Number")
	@Column(name = "account",unique = true)
	private String adminAccountNo;
	
	
	@NotBlank(message = "IFSC number is Mandatory")
	@Pattern(regexp="[0-9A-Za-z]{11}",message ="Invalid Bank Account Number")
	@Column(name = "ifsc",unique = true)
	private String adminIFSC;
	
	@Column(name = "balance")
	private Integer adminBalance;
	
	public Admin() {
		
	}

	public Admin(Integer adminId,
			@NotBlank(message = "Admin Name must not be blank") @Pattern(regexp = "[A-Za-z ]*", message = "Name should contain only characters") String adminName,
			@Email(message = "Email should be valid") String adminEmail,
			@NotBlank(message = "Phone Number is Mandatory") @Pattern(regexp = "[0-9]{10}", message = "Invalid Phone Number") String adminPhone,
			@NotBlank(message = "Bank Name is Mandatory") String adminBank,
			@NotBlank(message = "Bank Account Number is Mandatory") @Pattern(regexp = "[0-9]{12}", message = "Invalid Bank Account Number") String adminAccountNo,
			@NotBlank(message = "IFSC number is Mandatory") @Pattern(regexp = "[0-9A-Za-z]{11}", message = "Invalid Bank Account Number") String adminIFSC,
			Integer adminBalance) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPhone = adminPhone;
		this.adminBank = adminBank;
		this.adminAccountNo = adminAccountNo;
		this.adminIFSC = adminIFSC;
		this.adminBalance = adminBalance;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPhone() {
		return adminPhone;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	public String getAdminBank() {
		return adminBank;
	}

	public void setAdminBank(String adminBank) {
		this.adminBank = adminBank;
	}

	public String getAdminAccountNo() {
		return adminAccountNo;
	}

	public void setAdminAccountNo(String adminAccountNo) {
		this.adminAccountNo = adminAccountNo;
	}

	public String getAdminIFSC() {
		return adminIFSC;
	}

	public void setAdminIFSC(String adminIFSC) {
		this.adminIFSC = adminIFSC;
	}

	public Integer getAdminBalance() {
		return adminBalance;
	}

	public void setAdminBalance(Integer adminBalance) {
		this.adminBalance = adminBalance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail + ", adminPhone="
				+ adminPhone + ", adminBank=" + adminBank + ", adminAccountNo=" + adminAccountNo + ", adminIFSC="
				+ adminIFSC + ", adminBalance=" + adminBalance + "]";
	}
}
