package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// survey entity

@Entity
@Table(name="survey")
public class Survey  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer surveyId;
	
	@Column(name = "result")
	private boolean surveyResult;
	
	public Survey() {
	}

	public Survey(Integer surveyId, boolean surveyResult) {
		super();
		this.surveyId = surveyId;
		this.surveyResult = surveyResult;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public boolean isSurveyResult() {
		return surveyResult;
	}

	public void setSurveyResult(boolean surveyResult) {
		this.surveyResult = surveyResult;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", surveyResult=" + surveyResult + "]";
	}
	
	
	

}
