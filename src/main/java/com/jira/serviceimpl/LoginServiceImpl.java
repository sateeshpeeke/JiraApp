package com.jira.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jira.entity.UserEntity;
import com.jira.repository.LoginRegisterRepo;
import com.jira.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRegisterRepo loginRepo;

	@Override
	public boolean isValidCredentials(String email, String password) {

		UserEntity userEntity = loginRepo.findByEmailAndPassword(email, password);
		if (userEntity != null) {
			return true;
		} else {
			return false;
		}

	}

}
