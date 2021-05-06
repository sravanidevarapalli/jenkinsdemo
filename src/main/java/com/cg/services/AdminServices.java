package com.cg.services;

import java.util.List;

import com.cg.entities.Admin;

public interface AdminServices {
	
	public List<Admin> addAdmin(Admin a);
	
	public List<Admin> updateAdmin(Admin a);
	
	public List<Admin> deleteAdmin(Integer adminId);
	
	public Admin getAdminById(Integer adminId);
	
	public List<Admin> getAllAdmins();
	
}
