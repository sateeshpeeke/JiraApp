package com.jira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jira.constant.Constant;
import com.jira.constant.ConstantMappings;

@Controller
public class LogOutController {
	@GetMapping(ConstantMappings.LOG_OUT)
	public String logOut() {
		return Constant.LOGIN;

	}

}
