package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.CustomerCarpenterMapping;

// dao layer for customer carpenter mapping

@Repository("CustomerCarpenterMappingDao")
public interface CustomerCarpenterMappingDao extends JpaRepository<CustomerCarpenterMapping, Integer>{

}
