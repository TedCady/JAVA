package com.cady.drivers.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cady.drivers.models.Person;
import com.cady.drivers.services.LicenseService;
import com.cady.drivers.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public PersonController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}

	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("personObject") Person person, Model model) {
		return "NewPerson.jsp";
	}
	
	@RequestMapping(value="/addperson", method=RequestMethod.POST)
	public String addperson(@Valid @ModelAttribute("personObject") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "NewPerson.jsp";
		} else {
			personService.createPerson(person);
			return "redirect:licenses/new";
		}
	}
	
	@RequestMapping("/persons/{id}")
	public String viewDetails(@PathVariable("id") Long id, Model model) {
		model.addAttribute("license", licenseService.getLicense(id).get());
		return "ShowMe.jsp";
	}
}

