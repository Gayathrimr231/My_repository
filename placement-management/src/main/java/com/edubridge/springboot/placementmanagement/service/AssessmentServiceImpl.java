package com.edubridge.springboot.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.placementmanagement.entities.Assessment;
import com.edubridge.springboot.placementmanagement.entities.Studentattendance;
import com.edubridge.springboot.placementmanagement.repository.AssessmentRepository;


@Service
public class AssessmentServiceImpl implements AssessmentService{


	@Autowired
	AssessmentRepository assessmentRepo;
	
	@Autowired
	StudentattendanceService studentattendanceService;

	
	@Override
	public Assessment saveAssessment(Assessment assessment) {
		Studentattendance studentattendance = assessment.getStudentattendance();
		Studentattendance s1 = studentattendanceService.getStudentattendanceById(studentattendance.getStudId());
		assessment.setStudentattendance(s1);
		return assessmentRepo.save(assessment);
	}

	@Override
	public List<Assessment> getAllAssessments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Assessment getAssessmentById(int studId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAssessment(int studId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Assessment updateAssessment(int studId, Assessment assessment) {
		// TODO Auto-generated method stub
		return null;
	}
	
}