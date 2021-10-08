package com.edubridge.springboot.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.placementmanagement.entities.Login;
import com.edubridge.springboot.placementmanagement.repository.LoginRepository;



@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	 LoginRepository loginrepo;

	public Login login(String username, String password) {
		Login user = loginrepo.findByUsernameAndPassword(username, password);
		return user;
	}

	@Override
	public Login saveLogin(Login login) {
		return loginrepo.save(login);

	}

	@Override
	public List<Login> getAllLogins() {
		return loginrepo.findAll();

	}

}