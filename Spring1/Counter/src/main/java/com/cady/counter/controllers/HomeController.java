package com.cady.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") != null) {
			Integer count = (Integer) session.getAttribute("count");
			count ++;
			session.setAttribute("count", count);
		}
		else {
			session.setAttribute("count", 0);
			Integer count = (Integer) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "index.jsp";
		
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if(session.getAttribute("count") != null){
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count);
		}
		else {
			session.setAttribute("count",0);
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count);
		}
		return "counter.jsp";
	}
}
