package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AdminDao;
import com.cg.entities.Admin;

// service layer implementation for admin

@Service("adminService")
public class AdminServicesImpl implements AdminServices{
	
	private static final Logger logger = LoggerFactory.getLogger(AdminServicesImpl.class);
	
	@Autowired
	AdminDao adminDao;
	
	
	// inserting admins to Postgres database
	@Override
	public List<Admin> addAdmin(Admin admin) {
		
		logger.info("Inserting an admin ...");
		adminDao.saveAndFlush(admin);
		return adminDao.findAll();
	}
	
	// updating admin to Postgres database
	@Override
	public List<Admin> updateAdmin(Admin admin) {
		
		logger.info("Updating an admin ...");
		adminDao.save(admin);
		return adminDao.findAll();
	}
	
	
	// deleting admin from postgres database
	@Override
	public List<Admin> deleteAdmin(Integer adminId) {
		
		logger.info("Delete an admin using adminId ...");
		adminDao.deleteById(adminId);
		return adminDao.findAll(); 
	}
	
	
	// Retrieving admin by id from postgres database
	@Override
	public Admin getAdminById(Integer adminId) {
		
		logger.info("Retrieve an admin by Id ...");
		Optional<Admin> a =  adminDao.findById(adminId);// if present it will give value	
		if(a.isPresent())
			return a.get();
		else
			return null;
	}
	
	// Retrieving all admins from postgres database
	@Override
	public List<Admin> getAllAdmins() {
		logger.info("Retrieve all admins ...!!");
		return adminDao.findAll();
	}
	
}
