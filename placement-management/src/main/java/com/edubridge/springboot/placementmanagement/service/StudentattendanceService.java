package com.edubridge.springboot.placementmanagement.service;

import java.util.List;

import com.edubridge.springboot.placementmanagement.entities.Studentattendance;
public interface StudentattendanceService {

public Studentattendance saveStudentattendance(Studentattendance studentattendance);
	
	public List<Studentattendance> getAllStudentattendances();
	
	public Studentattendance getStudentattendanceById(int studId);
	
	public void deleteStudentattendanceById(int studId);
	
	public Studentattendance updateStudentattendance(int studId, Studentattendance studentattendance);

}
