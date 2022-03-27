package com.mindtree.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.app.entity.DocterInfo;

@Repository
public interface DocterInfoRepo extends JpaRepository<DocterInfo, Integer> {
	
	
}
