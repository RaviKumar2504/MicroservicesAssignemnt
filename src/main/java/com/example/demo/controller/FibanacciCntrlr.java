package com.example.demo.controller;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FibanacciCntrlr {

	@RequestMapping("/Fibonacci")
	public int msg(@QueryParam("n") double n){
		AssignemntsService assignemntsService = new AssignemntsService();
		int b;
		
		b= assignemntsService.getFibSEries(n);
        
        return b;
	}
}
