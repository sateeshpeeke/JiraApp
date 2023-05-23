package com.jira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jira.constant.ConstantMappings;

@Controller
public class HealthController {
	
	@GetMapping(ConstantMappings.HEALTH)
	public String welcome() {
		return "Application Run Successfully";

	}

}
