package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample1 {

	@Value("${myname}")
	String name;
	@GetMapping("name")
	public String get() {
		return name;
	}
}
