package com.demo.sonarcloud.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping(value= "/test")
	public String HelloWorld() {
	   return "Hello from ApiController";
	}
	
	@GetMapping(value= "/welcome")
	public String Welcome() {
	   return "";
	}
}
