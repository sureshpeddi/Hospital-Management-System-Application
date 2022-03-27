package com.mindtree.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.app.entity.AdminCredetials;
import com.mindtree.app.service.AdminCredentialsService;
@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class AdminCredentialsController {
	
	@Autowired
	AdminCredentialsService service;
	
	@GetMapping("/admin")
	public List<AdminCredetials> findCredentials() {
		return service.findCredentials();
	}
}
