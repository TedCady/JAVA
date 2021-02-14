package com.cady.gfwr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GfwrApplication {

	public static void main(String[] args) {
		SpringApplication.run(GfwrApplication.class, args);
	}

}
