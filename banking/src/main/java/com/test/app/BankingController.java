package com.test.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController {
	
	@RequestMapping(value="/banking")
	public String getData() {
		return "Welcome to banking application new world !!!!";
	}
	
	@RequestMapping(value="/bankin")
	public String getDat() {
		return "Welcome to banking application new world !!!!";
	}

}
