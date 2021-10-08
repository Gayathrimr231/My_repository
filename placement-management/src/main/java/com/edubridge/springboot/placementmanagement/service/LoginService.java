package com.edubridge.springboot.placementmanagement.service;


import java.util.List;

import com.edubridge.springboot.placementmanagement.entities.Login;


public interface LoginService {

	public Login saveLogin(Login login);
	public List <Login> getAllLogins();
}
