package cn.earth.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private Environment environment;
	
	@GetMapping("/hello")
	public String hello(){
		
		return environment.getProperty("name")+":"+environment.getProperty("url");
	}
}
