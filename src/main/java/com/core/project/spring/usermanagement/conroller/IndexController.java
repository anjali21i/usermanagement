package com.core.project.spring.usermanagement.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping("login")
	public String getLoginPage() {

		return "hello";
	}
	
	
	@GetMapping("signup")
	public String getSignupPage() {

		return "hello";
	}
}
