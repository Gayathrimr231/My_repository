package com.edubridge.springboot.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.springboot.placementmanagement.entities.Assessment;
import com.edubridge.springboot.placementmanagement.service.AssessmentService;



@RestController
public class AssessmentController {

	@Autowired 
	AssessmentService assessmentService;
	
	@PostMapping("/asmnt/add")
	public Assessment saveAssessment (@RequestBody Assessment assessment ) {
		return assessmentService.saveAssessment(assessment);
	}
	
	@GetMapping("/asmnt/assessments")
	public List<Assessment> getAllAssessment(){
		return assessmentService.getAllAssessments();
	}

}
