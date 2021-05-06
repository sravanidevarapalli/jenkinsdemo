package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.entities.SurveyComplainMapping;

// dao layer for survey complain mapping

@Repository("SurveyComplainMappingdao")
public interface SurveyComplainMappingDao extends JpaRepository<SurveyComplainMapping, Integer> {

}
