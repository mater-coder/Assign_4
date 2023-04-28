package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {
	
	@RequestMapping(path="/login")
	 public String login() {
		 return "login";
	 }
	@RequestMapping(path="/register")
	 public String registerUser() {
		 return "register";
	 }
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public ModelAndView handleForm(@RequestParam("action") String action) {
		if(action.equals("register"))
			return new ModelAndView(new RedirectView("/register", true));
		if(action.equals("login")) {
			//make the user login
		}
		 return new ModelAndView(new RedirectView("/", true));
	}
	
//	 @RequestMapping(value="/login", method=RequestMethod.POST)
//	  public String login(@RequestParam("email") String email, 
//	                      @RequestParam("password") String password, 
//	                      Model model) {
//	    System.out.println("Email :: " + email);
//	    System.out.println("Password :: " + password);
//	    // Check email and password
//	    if (email.equals("user@example.com") && password.equals("password123")) {
//	      model.addAttribute("message", "Login successful!");
//	      return "home";
//	    } else {
//	      model.addAttribute("message", "Invalid email or password.");
//	      return "login";
//	    }
//	  }

}
