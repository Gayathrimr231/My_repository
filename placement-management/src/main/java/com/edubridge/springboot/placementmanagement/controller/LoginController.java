package com.edubridge.springboot.placementmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.edubridge.springboot.placementmanagement.entities.Login;
import com.edubridge.springboot.placementmanagement.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	// add the details in login table
	@PostMapping("/login/add")
	public Login saveLogin(@RequestBody Login login) {
		return loginService.saveLogin(login);
	}
	
	// view the records
	@GetMapping("/user/logins")
	public List<Login>getAllLogins(){
		return loginService.getAllLogins();
		
	}
}