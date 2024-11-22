package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("ju")
@Primary
public class JuniorEmp implements Employee{
	public String getMessage() {
		return "this is Junior";
		
	}

}
