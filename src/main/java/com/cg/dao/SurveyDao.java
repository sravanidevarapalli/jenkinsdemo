package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Survey;

//dao layer for survey

@Repository("surveyDao")
public interface SurveyDao extends JpaRepository<Survey,Integer>{

}
