package com.college.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {


	@RequestMapping(value="/home")
	public ModelAndView  getWelcome(ModelMap model){
		
		/*String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";*/
		return new ModelAndView("home", "message", "pushker");
	
	}
	@RequestMapping(value="/test")
	public ModelAndView  Welcome(ModelMap model){
		
		/*String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";*/
		return new ModelAndView("test", "message", "pushker");
	
	}
}
