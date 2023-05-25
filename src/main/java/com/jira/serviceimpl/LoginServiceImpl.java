package com.jira.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jira.constant.Constant;
import com.jira.entity.StoryEntity;
import com.jira.entity.UserEntity;
import com.jira.repository.LoginRegisterRepo;
import com.jira.repository.LoginRepo;
import com.jira.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRegisterRepo loginRepo;
	@Autowired
	private LoginRepo loginRepo1;

	@Override
	public boolean isValidCredentials(String email, String password) {

		UserEntity userEntity = loginRepo.findByEmailAndPassword(email, password);

		return userEntity != null ? Constant.TRUE : Constant.FALSE;

	}

	@Override
	public void jiraTaskAdd(StoryEntity taskEntity) {
		loginRepo1.save(taskEntity);

	}

}
