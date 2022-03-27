package com.mindtree.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.app.entity.*;

import com.mindtree.app.repository.AdminCredentialsRepo;

@Service
public class AdminCredentialsService {
	
	@Autowired
	AdminCredentialsRepo repo;
	
	public List<AdminCredetials> findCredentials() {
		return repo.findAll();
	}
}
