package com.jira.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jira.entity.StoryEntity;
import com.jira.repository.StoryRepository;
import com.jira.service.StoryService;

@Service
public class StoryServiceImpl implements StoryService {

	@Autowired
	private StoryRepository storyRepository;

	@Override
	public void storyCreated(StoryEntity storyEntity) {

		storyRepository.save(storyEntity);
	}

}
