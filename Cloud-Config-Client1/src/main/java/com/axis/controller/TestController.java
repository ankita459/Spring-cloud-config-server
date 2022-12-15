package com.axis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
//@Profile("developement")
public class TestController {
	
	@Value("${greet}")
	private String welcomeMsg;
	
	@Value("${insurnace.provider.url}")
	private String gitMsg;

	@RequestMapping("/welcome")
	public String sayHello() {
		return "hello" + welcomeMsg;
	}
	
	@RequestMapping("/greeting")
	public String sayHello2() {
		return "hi"+ gitMsg;
	}
}

