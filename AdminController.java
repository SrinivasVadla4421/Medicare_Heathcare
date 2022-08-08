package com.medicare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.Medicine;
import com.medicare.service.AdminService;

@RestController
@RequestMapping("/rest/create/")
public class AdminController {


	@Autowired
	private AdminService iAdminService;
	
	@PostMapping("/medicines")  
	public  int saveBook(@RequestBody Medicine medicine)   
	{  
		iAdminService.create(medicine); 
	return medicine.getMedicineId();  
	} 
}
