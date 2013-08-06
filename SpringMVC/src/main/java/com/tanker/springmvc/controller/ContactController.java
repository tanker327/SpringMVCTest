package com.tanker.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.tanker.springmvc.form.Contact;
import com.tanker.springmvc.service.ContactService;

@Controller
@SessionAttributes
public class ContactController {
	
	@Autowired
	private ContactService contactService;

	@RequestMapping(value="/addContact", method=RequestMethod.POST)
	public String addContact(@ModelAttribute("command")Contact contact, BindingResult result){
		System.out.println("First Name:" + contact.getFirstname() + 
                "Last Name:" + contact.getLastname());
		contactService.addContact(contact);
		System.out.println("Controller");
		return "contact";
	}
	
	@RequestMapping("/contacts")
	public ModelAndView showContacts(){
		return new ModelAndView("contact","command",new Contact());
	}

}
