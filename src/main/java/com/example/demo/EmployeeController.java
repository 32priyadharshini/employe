package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	@Autowired
	@Qualifier("se")
	Employee e;
	@GetMapping("/get")
	public String get() {
		return e.getMessage();
	}
	
	@GetMapping("/getvalue")
	public String request(@RequestParam String name,@RequestParam String password ) {
		if(name=="priya" && password=="priya123") {
			return "valid";
		}
		else {
			return "Invalid";
		}
	}
}
