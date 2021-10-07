package com.edubridge.springboot.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edubridge.springboot.placementmanagement.entities.Studentattendance;
import com.edubridge.springboot.placementmanagement.service.StudentattendanceService;

@Controller
public class StudentattendanceViewController {

	@Autowired
	StudentattendanceService studentattendanceService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Studentattendance> studentattendanceList = studentattendanceService.getAllStudentattendances();
		model.addAttribute("studentattendanceList", studentattendanceList);
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewStudentattendancePage(Model model) {
		Studentattendance studentattendance = new Studentattendance();
		model.addAttribute("studentattendance", studentattendance);
		return "new_Studentattendance";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savestudentattendance(@ModelAttribute("studentattendance") Studentattendance studentattendance) {
		studentattendanceService.saveStudentattendance(studentattendance);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentattendancePage(@PathVariable (name = "id") int studId) {
		ModelAndView mav = new ModelAndView("edit_studentattendance");
		Studentattendance studentattendance = studentattendanceService.getStudentattendanceById(studId);
		mav.addObject("studentattendance", studentattendance);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudentattendance(@PathVariable (name = "id") int studId) {
		studentattendanceService.deleteStudentattendanceById(studId);
		return "redirect:/";
	}

}


