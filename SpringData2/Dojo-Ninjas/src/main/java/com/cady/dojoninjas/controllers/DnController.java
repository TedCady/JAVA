package com.cady.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cady.dojoninjas.model.Dojo;
import com.cady.dojoninjas.model.Ninja;
import com.cady.dojoninjas.services.DojoService;
import com.cady.dojoninjas.services.NinjaService;

@Controller
@RequestMapping("/")
public class DnController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	public DnController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping("")
	public String index(@ModelAttribute("dojo") Dojo s, @ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojo = dojoService.allDojos();
		model.addAttribute("dojos", dojo);
		return "dashboard.jsp";
	}
	
	@RequestMapping(value="/dojos/new", method=RequestMethod.POST)
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult results) {
		if(results.hasErrors()) {
			return "dashboard.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/";
		}
	}
	
	@RequestMapping(value="/dojos/{id}", method=RequestMethod.GET)
	public String newDojo(@PathVariable("id") Long id, Model model, Dojo dojo) {
		dojo = dojoService.findDojo(id);
		List<Ninja> ninja = ninjaService.ninjaByDojo(id);
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninja", ninja);
		return "show.jsp";
	}
	
	@RequestMapping(value="/ninjas/new", method=RequestMethod.POST)
	public String newDojo(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult results) {
		if(results.hasErrors()) {
			return "dashboard.jsp";
		}else {
			ninjaService.createNinja(ninja);
			return "redirect:/";
		}
	}
	  @RequestMapping(value="/dojo/{id}", method=RequestMethod.GET)
	    public String show(@PathVariable("id") Long id, Model model) {
	    	List<Ninja> ninja = ninjaService.ninjaByDojo(id);
	    	model.addAttribute("ninja", ninja);
	    	return "show.jsp";        
	    } 
}
