package com.jira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jira.constant.ConstantMappings;

@RestController
@RequestMapping(ConstantMappings.JIRA)
public class HealthController {
	
	@GetMapping(ConstantMappings.HEALTH)
	public String welcome() {
		return "Application Run Successfully";

	}

}
