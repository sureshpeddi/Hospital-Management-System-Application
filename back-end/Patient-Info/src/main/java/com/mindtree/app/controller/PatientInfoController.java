package com.mindtree.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mindtree.app.entity.*;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.app.repository.service.PatientInfoService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PatientInfoController {
	
	@Autowired
	PatientInfoService service;
	
	@GetMapping("/patients")
	public List<PatientInfo> getAllPatientsInfo(){
		return service.getAllPatientInfo();
	}
	
	@PostMapping("/patients")
	public PatientInfo addPatientInfo(@RequestBody PatientInfo info) {
		return service.addPatientInfo(info);
	}
	@DeleteMapping("/patients/{id}")
	public String deletePatientInfo(@PathVariable int id) {
		service.deletePatientInfo(id);
		return "deleted successfully";
	}
	
	@PutMapping("/patients/{id}")
	public PatientInfo updatePatientInfo(@RequestBody PatientInfo info,@PathVariable int id) {
		return service.updatePatientInfo(info,id);
	}
}
