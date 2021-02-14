package com.cady.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TheForm {
@RequestMapping(value="/submit", method=RequestMethod.POST)
		public String thisCode(@RequestParam(value="code") String code) {
		String theCode = "bushido";
		if(code.matches(theCode)) {
			return "redirect:/code";
		}
		else {
			return "redirect:/createError";
		}
}
}
