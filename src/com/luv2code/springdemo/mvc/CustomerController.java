package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// Add an InitBinder to convert/trim input strings
	// Remove leading and trailing whitespace
	// Resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	// Create a method to show the form
		@RequestMapping("/showForm")
		public String showForm(Model theModel) {
			// Create a new Customer object
			Customer theCustomer = new Customer();
			// Add the student to the model
			theModel.addAttribute("customer", theCustomer);
			return "customer-form";
		}
		
		// Create a method to process the form 
		@RequestMapping("/processForm")
		public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
				BindingResult theBindingResult) {
			
			System.out.println("Last name: |" + theCustomer.getLastName() + "|");
			
			if (theBindingResult.hasErrors()) {
				return "customer-form";
			} else {
				return "customer-confirmation";
			}
		}
	
}
