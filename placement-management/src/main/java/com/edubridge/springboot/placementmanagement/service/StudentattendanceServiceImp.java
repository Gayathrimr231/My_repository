package com.edubridge.springboot.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.placementmanagement.entities.Studentattendance;
import com.edubridge.springboot.placementmanagement.exception.RecordNotFoundException;
import com.edubridge.springboot.placementmanagement.repository.StudentattendanceRepository;

@Service
public class StudentattendanceServiceImp implements StudentattendanceService{

	
	
		
		@Autowired
		StudentattendanceRepository studentattendanceRepo;

		@Override
		public Studentattendance saveStudentattendance(Studentattendance studentattendance) {
			return  studentattendanceRepo.save(studentattendance);
			}

		@Override
		public List<Studentattendance> getAllStudentattendances() {
			// TODO Auto-generated method stub
			return studentattendanceRepo.findAll();
		}

		@Override
		public Studentattendance getStudentattendanceById(int studId) {
			// TODO Auto-generated method stub
			return studentattendanceRepo.findById(studId)
					.orElseThrow(() -> new RecordNotFoundException("Student with ID" +studId+ " not found"));
			}

		@Override
		public void deleteStudentattendanceById(int studId) {
			// TODO Auto-generated method stub
			Studentattendance studentattendance=getStudentattendanceById(studId);
			studentattendanceRepo.delete(studentattendance);			
		}

		@Override
		public Studentattendance updateStudentattendance(int studId, Studentattendance studentattendance) {
			Studentattendance s1=getStudentattendanceById(studId);
			s1.setStudName(studentattendance.getStudName());
			s1.setCourseName(studentattendance.getCourseName());
			s1.setTotalDays(studentattendance.getTotalDays());
			s1.setNoOfDaysPresent(studentattendance.getNoOfDaysPresent());
			s1.setNoOfDaysAbsent(studentattendance.getNoOfDaysAbsent());
			s1.setTotalPerc(studentattendance.getTotalPerc());
			return studentattendanceRepo.save(s1);			
		}
		
 
		
		
		
	}



