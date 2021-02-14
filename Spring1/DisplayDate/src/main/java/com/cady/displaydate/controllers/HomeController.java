package com.cady.displaydate.controllers;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {    
        return "index.jsp";
    }
    @RequestMapping("/date")
    public String date(Model model) {
    	SimpleDateFormat dateString = new SimpleDateFormat("d");
    	SimpleDateFormat dayString = new SimpleDateFormat("EEEE");
    	SimpleDateFormat monthString = new SimpleDateFormat("MMMM");
    	SimpleDateFormat year = new SimpleDateFormat("YYYY");
//    	Date dateGen = new Date();
    	StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(dayString.format(new Date()));
			stringBuilder.append(", the ");
			stringBuilder.append(dateString.format(new Date()));
			stringBuilder.append(" of ");
			stringBuilder.append(monthString.format(new Date()));
			stringBuilder.append(", ");
			stringBuilder.append(year.format(new Date()));
		String dateValue = stringBuilder.toString();
    	model.addAttribute("dateValue", dateValue);
        return "date.jsp";
    }
    @RequestMapping("/time")
    public String time(Model model) {  
    	SimpleDateFormat time = new SimpleDateFormat("h:mm aa");
    	String timeValue = time.format(new Date());
       	model.addAttribute("timeValue", timeValue);
        return "time.jsp";
        
    }
}



