package com.jira.service;

import com.jira.entity.StoryEntity;

public interface LoginService {

	public boolean isValidCredentials(String email, String password);

	public void jiraTaskAdd(StoryEntity taskEntity);

}
