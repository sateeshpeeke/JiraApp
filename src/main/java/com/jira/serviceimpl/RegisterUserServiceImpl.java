package com.jira.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jira.entity.UserEntity;
import com.jira.repository.LoginRegisterRepo;
import com.jira.service.RegisterUserService;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Autowired
	private LoginRegisterRepo loginRegisterRepo;

	@Override
	public void registerUser(UserEntity userEntity) {

		loginRegisterRepo.save(userEntity);

	}

}
