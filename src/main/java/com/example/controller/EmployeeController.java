package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController 
{
	@PostMapping("/save")
	public String createEmployee()
	{
		return "SAVE";
	}
	
	@GetMapping("/show")
	public String fetchEmployee()
	{
		return "EMPLOYEE-GET";		
	}

	@PutMapping("/modify")
	public String updateEmployee()
	{
		return "EMPLOYEE-PUT";
		
	}
	
	@DeleteMapping("/remove")
	public String removeEmployee()
	{
		return "EMPLOYEE-DELETE";
	}
	
	@PatchMapping("/modifyEmail")
	public String updateEmployeeEmail()
	{
		return "EMPLOYEE-PARTIAL UPDATE";
		
	}
}
