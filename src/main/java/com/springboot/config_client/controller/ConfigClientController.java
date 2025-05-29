package com.springboot.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

	@Value("${company}")
	private String companyName;
	
	@Value("${name}")
	private String myName;
	
	@GetMapping("/company")
	//@RequestMapping(path = "/company", method = RequestMethod.GET)
	public String getCompanyName() {
		System.out.println("Fetching company name: " + companyName);
		return companyName;
	}
	
	@GetMapping("/myname")
	public String getMyName() {
		return myName;
	}
	
}
