package com.controller.fib;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FibController {

	@RequestMapping("/")
	public String msg(){
		return "Hello World";
	}
}
