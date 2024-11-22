package com.example.demo;

import org.springframework.stereotype.Service;

@Service("se")
public class SeniorEmp implements Employee {
	public String getMessage() {
		return "this is senior";
	}

}
