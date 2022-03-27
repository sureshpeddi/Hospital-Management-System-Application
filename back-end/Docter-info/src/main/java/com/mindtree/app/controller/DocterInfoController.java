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
import org.springframework.web.bind.annotation.RestController;
import com.mindtree.app.entity.*;

import com.mindtree.app.service.DocterInfoService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class DocterInfoController {
	@Autowired
	DocterInfoService service;
	
	@GetMapping("/doctors")
	public List<DocterInfo> getAllDoctersInfo(){
		return service.getAllDoctersInfo();
	}
	
	@PostMapping("/doctors")
	public DocterInfo addDocterInfo(@RequestBody DocterInfo info) {
		return service.addDocterInfo(info);
	}
	
	@DeleteMapping("/doctors/{id}")
	public String deleteDoctorInfo(@PathVariable int id) {
		 service.deleteDocterInfo(id);
		 return "deleted successfuly";
	}
	
	@PutMapping("/docters/{id}")
	public DocterInfo updateDocterInfo(@RequestBody DocterInfo info,@PathVariable int id){
		return service.updateDocterInfo(info,id);
	}
}
