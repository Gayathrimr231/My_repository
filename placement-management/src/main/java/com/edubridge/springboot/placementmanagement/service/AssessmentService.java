package com.edubridge.springboot.placementmanagement.service;

import java.util.List;

import com.edubridge.springboot.placementmanagement.entities.Assessment;



public interface AssessmentService {

	public List<Assessment> getAllAssessments();
	public Assessment getAssessmentById(int studId);
	public void deleteAssessment(int studId);
	public Assessment updateAssessment(int studId, Assessment assessment);
	Assessment saveAssessment(Assessment assessment);
}
