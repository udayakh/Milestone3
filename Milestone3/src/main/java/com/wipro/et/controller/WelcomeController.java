package com.wipro.et.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message;

	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Example");
		model.addObject("message", "This is Hello World!");
		model.setViewName("welcome");
		System.out.println("° ° ° ° welcomePage running. model = " + model);
		return model;
	}


}