package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.Courseservice;

@RestController
public class Mycontroller {
	@Autowired
	private Courseservice courseservice;
	
	@GetMapping  ("/home")
	public String home() {
		return "welcome to home page";
	}
		
		@GetMapping ("/courses")
		public List<Course>getcourse()
		{
			
			return this.courseservice.getcourse();
		}


}
		