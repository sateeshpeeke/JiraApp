package com.jira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jira.constant.ConstantMappings;

@Controller
public class HomeController {

	@GetMapping(ConstantMappings.HOME)
	public String home() {
		return "home";
	}

	@RequestMapping("/back")
	public String back() {
		return "redirect:/home";
	}

	@RequestMapping("/back1")
	public String back1() {
		return "redirect:/registration";
	}

}
