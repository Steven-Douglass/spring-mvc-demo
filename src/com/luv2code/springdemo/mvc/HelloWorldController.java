package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// Show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// Add a new controller method to read form data 
	// and add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// Read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// Convert the form data to uppercase
		theName = theName.toUpperCase();
		
		// Create our message
		String result = "Yo! " + theName;
		
		// Add the message to the model
		model.addAttribute("message",  result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName,
			Model model) {
		
		// Convert the form data to uppercase
		theName = theName.toUpperCase();
		
		// Create our message
		String result = "Hey My Friend from v3! " + theName;
		
		// Add the message to the model
		model.addAttribute("message",  result);
		
		return "helloworld";
	}
	

}
