package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/admin2")
public class Hello {
	@GetMapping(value="/sendhello")
	public String hello() {
		return "deployement team sucessfully deployed";
	}

}

