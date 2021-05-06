package com.cg.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Admin;

// dao layer for admin

@Repository("adminDao")
public interface AdminDao extends JpaRepository<Admin,Integer> {

}