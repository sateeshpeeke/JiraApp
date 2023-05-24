package com.jira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jira.constant.Constant;
import com.jira.constant.ConstantMappings;
import com.jira.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(ConstantMappings.LOGIN_PAGES)
	public String loginForm() {
		return Constant.LOGIN;
	}

	@PostMapping(ConstantMappings.LOG_IN)
	public String login(@RequestParam String email, @RequestParam String password) {

		boolean flag = loginService.isValidCredentials(email, password);

		return flag == true ? Constant.ADD_TASK : Constant.ERROR;
	}
}
