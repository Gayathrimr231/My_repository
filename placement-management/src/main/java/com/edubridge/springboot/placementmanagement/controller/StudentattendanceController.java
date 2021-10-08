package com.edubridge.springboot.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.edubridge.springboot.placementmanagement.entities.Studentattendance;
import com.edubridge.springboot.placementmanagement.exception.InvalidInputException;
import com.edubridge.springboot.placementmanagement.service.StudentattendanceService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentattendanceController {

		@Autowired
		StudentattendanceService studentattendanceService;
		
		@PostMapping("/attend/add")
		public Studentattendance saveStudentattendance(@RequestBody Studentattendance studentattendance) {
			return studentattendanceService.saveStudentattendance(studentattendance);
		}
		
		@GetMapping("/attend/studentattendences")
		public List<Studentattendance> getAllStudentattendance(){
			return studentattendanceService.getAllStudentattendances();
		}
		
		@GetMapping("/attend/{studId}")
		public ResponseEntity<Studentattendance> getStudentattendanceById(@PathVariable int studId) {
			if(studId <= 0) {
				throw new InvalidInputException(studId+" not a valid Student ID");
			}
			Studentattendance studentattendance = studentattendanceService.getStudentattendanceById(studId);
			return new ResponseEntity<Studentattendance>(studentattendance, HttpStatus.OK);
		}
		
		@DeleteMapping("/attend/{studId}")
		public String deleteStudentattendanceById(@PathVariable int studId) {
			studentattendanceService.deleteStudentattendanceById(studId);
			return "Student Deleted";
		}
		
		@PutMapping("/attend/{id}")
		public ResponseEntity<Studentattendance> updateStudentattendance(@PathVariable (value = "id") int studId, 
				@RequestBody Studentattendance studentattendance) {
			Studentattendance updatedStudentattendance = studentattendanceService.updateStudentattendance(studId, studentattendance);
			return new ResponseEntity<Studentattendance>(updatedStudentattendance, HttpStatus.OK);
		}
		
	}


