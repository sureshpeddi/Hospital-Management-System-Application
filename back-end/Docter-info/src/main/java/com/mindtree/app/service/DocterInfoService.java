package com.mindtree.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.app.entity.*;

import com.mindtree.app.repository.DocterInfoRepo;

@Service
public class DocterInfoService {
	
	@Autowired
	DocterInfoRepo repo;
	
	public List<DocterInfo> getAllDoctersInfo(){
		return repo.findAll();
	}
	
	public DocterInfo addDocterInfo(DocterInfo info) {
		return repo.save(info);
	}
	
	public void deleteDocterInfo(int id) {
		repo.deleteById(id);
	}
	
	public DocterInfo updateDocterInfo(DocterInfo info,int id) {
		return repo.save(info);
	}
}
