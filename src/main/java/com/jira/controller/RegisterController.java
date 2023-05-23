package com.jira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jira.constant.ConstantMappings;
import com.jira.entity.UserEntity;
import com.jira.service.RegisterUserService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterUserService registerUserService;

	@RequestMapping(ConstantMappings.NEW_USER)
	public String registration() {
		return "registration";
	}

	@PostMapping(ConstantMappings.REGISTER)
	public String registerUser(UserEntity userEntity, Model model) {

		registerUserService.registerUser(userEntity);
		return "success";

	}

}
