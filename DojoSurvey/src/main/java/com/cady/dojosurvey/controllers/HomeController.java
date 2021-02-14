package com.cady.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;







@Controller
@RequestMapping("/")
public class HomeController {

	
		@RequestMapping("")
		public String index() {
			return "index.jsp";
		}
		
		@RequestMapping(value="submit", method=RequestMethod.POST)
		public String submit(
			@RequestParam("name") String name,
			@RequestParam("location") String location,
			@RequestParam("language") String language,
			@RequestParam("comment") String comment,
			RedirectAttributes r){
				r.addFlashAttribute("name", name);
				r.addFlashAttribute("location", location);
				r.addFlashAttribute("language", language);
				r.addFlashAttribute("comment", comment);
				return "redirect:/results";			
		}
		
		@RequestMapping("results")
		public String results() {
			return "results.jsp";
		}
}
