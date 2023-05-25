package com.jira.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jira.constant.Constant;
import com.jira.constant.ConstantMappings;
import com.jira.entity.StoryEntity;
import com.jira.service.StoryService;

@Controller
public class StoryController {

	public static final Logger LOGGER = LoggerFactory.getLogger(StoryController.class);

	@Autowired
	private StoryService storyService;

	@GetMapping(ConstantMappings.ADD_JIRATASK)
	public String addTask() {
		return Constant.ADD_TASK;

	}

	@PostMapping(ConstantMappings.CREATE_STORY)
	public String createStory(StoryEntity storyEntity, Model model) {
		LOGGER.info("start create story method and cheking the input values {}", storyEntity);
		storyService.storyCreated(storyEntity);
		LOGGER.info("end create story method");
		return Constant.ADDED_SUCCESS;

	}

	@GetMapping(ConstantMappings.ADD_ONEMORE_TASK)
	public String oneMoreStory() {
		return Constant.ADD_TASK;

	}

}
