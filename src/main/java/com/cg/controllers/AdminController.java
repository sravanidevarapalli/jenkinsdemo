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

import com.cg.entities.Admin;
import com.cg.exceptions.AdminNotFoundException;
import com.cg.exceptions.CarpenterNotFoundException;
import com.cg.exceptions.CustomerNotFoundException;
import com.cg.services.AdminServices;
import com.cg.services.CustomerCarpenterMappingService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//Admin Controller which will interact with service layer

@RestController
@RequestMapping("/admin")
@Validated
@Api("An API for Admin Operations...!!!")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	// Here object of admin service will be created automatically
	@Autowired
	AdminServices adminService;

	// Creation of mapping service object through spring container
	@Autowired
	CustomerCarpenterMappingService carpenterMappingService;

	// This method will retrieve all the admin recrods from database
	@GetMapping("/findAll")
	@ApiOperation(value = "Get all Admins")
	public List<Admin> getAllAdmins() {
		logger.info("In Admin Controller to retrieve all Admins ..>!!!");

		return adminService.getAllAdmins();
	}

	// This method will find a particular admin with the help of id from the
	// database
	@GetMapping("/find/{adminId}")
	@ApiOperation(value = "Get Admin based on id")
	public Admin getAdminById(@PathVariable Integer adminId) throws AdminNotFoundException {
		logger.info("In Admin Controller to retrieve an Admin  by Id ..>!!!");

		Admin admin = null;
		try {
			logger.info("Admin Id to be searched..." + adminId);
			admin = adminService.getAdminById(adminId);
		} catch (Exception exception) {
			logger.info("In catch block of getAdminById() ...!");
			throw new AdminNotFoundException("Enter valid Admin id ");
		}

		return admin;

	}

	// This method will delete the employee with specified id from the database if,
	// it exists.
	@DeleteMapping("/delete/{adminId}")
	@ApiOperation(value = "delete Admin based on id")
	public List<Admin> deleteAdmin(@PathVariable Integer adminId) throws AdminNotFoundException {
		logger.info("In Admin Controller to delete an Admin by Id ..>!!!");

		try {
			logger.info("Admin Id to be deleted..." + adminId);
			adminService.getAdminById(adminId);
		} catch (Exception exception) {
			logger.info("In catch block of DeleteAdminById() ...!");
			throw new AdminNotFoundException("Enter an existing  Admin id to be deleted  ");
		}

		return adminService.deleteAdmin(adminId);
	}

	// This method is used to insert record into the database.
	@PostMapping("/insert")
	@ApiOperation(value = "Insert Admin in Database")
	public List<Admin> addAdmin(@Valid Admin admin) throws Exception {
		logger.info("in Admin controller to insert Admin into db");

		try {
			return adminService.addAdmin(admin);
		} catch (Exception exception) {
			throw new AdminNotFoundException("binding error");
		}

	}

	// This method is used to book the carpenter
	@ApiOperation(value = "Book carpenter for customer")
	@GetMapping("/bookCarpenter/{customerPhone}/{carpenterId}")
	public String bookCarpenter(@PathVariable String customerPhone, @PathVariable Integer carpenterId)
			throws CustomerNotFoundException, CarpenterNotFoundException {
		String returnValue = carpenterMappingService.bookCarpenter(customerPhone, carpenterId);
		if (returnValue.equals("Customer Not Found")) {
			throw new CustomerNotFoundException("Customer Not Found in database");
		}
		if (returnValue.equals("Carpenter Not Found")) {
			throw new CarpenterNotFoundException("Carpenter Not Found in database");
		}
		return returnValue;
	}
}
