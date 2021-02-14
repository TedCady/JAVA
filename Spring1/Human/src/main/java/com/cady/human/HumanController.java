package com.cady.human;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HumanController {
	
	@RequestMapping("")
	public String helloHuman() {
		return "Hello Human!";
	}
	
	@RequestMapping("/{firstName}")
		public String returnValue(@PathVariable String firstName) {
			return"Hello " +firstName + "!";
		}
	
	@RequestMapping("/{firstName}/{lastName}")
	public String returnValue(@PathVariable String firstName, @PathVariable String lastName) {
		return "Hello " + firstName + " " + lastName + "!";
	}
}
