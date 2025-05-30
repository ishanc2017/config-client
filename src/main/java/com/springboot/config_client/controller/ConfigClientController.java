package com.springboot.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

	@Value("${companyName}")
	private String companyName;
	
	@Value("${employeeName}")
	private String employeeName;
	
	@GetMapping("/company")
	public String getCompanyName() {
		return companyName;
	}
	
	@GetMapping("/name")
	public String getEmployeeName() {
		return employeeName;
	}
	
}
