package com.mindtree.app.repository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.app.entity.PatientInfo;
import com.mindtree.app.repository.PatientInfoRepo;

@Service
public class PatientInfoService {
	
	@Autowired
	PatientInfoRepo repo;
	
	public List<PatientInfo> getAllPatientInfo() {
		return repo.findAll();
	}
	
	public PatientInfo addPatientInfo(PatientInfo info) {
		return repo.save(info);
	}
	public void deletePatientInfo(int id) {
		 repo.deleteById(id);
	}
	
	public PatientInfo updatePatientInfo(PatientInfo info,int id) {
		return repo.save(info);
	}
}
