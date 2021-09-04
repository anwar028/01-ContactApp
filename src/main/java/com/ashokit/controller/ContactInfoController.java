package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashokit.entity.Contact;
import com.ashokit.service.ContactService;
 
@Controller
public class ContactInfoController {
	
	@Autowired
	private ContactService contactService;
	
	/**
	 * This method is used to load contact Info page
	 * @param model
	 * @return String
	 */
	
	@GetMapping("/contact")
	public String loadContactForm(Model model) {
		Contact contactObj = new Contact();
		model.addAttribute("contact", contactObj);
		return "contactInfo";
	}

} 
