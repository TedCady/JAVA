package com.cady.gfwr;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {
	@RequestMapping("{path}")
	public String returnValue(@PathVariable String path) {
		if(path.equalsIgnoreCase("dojo")) {
			return "The dojo is awesome!";
		}
		else if(path.equalsIgnoreCase("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		else if(path.equalsIgnoreCase("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		else {
			return "Invalid path";
		}
	}
}