package com.mindtree.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.app.entity.PatientInfo;

@Repository
public interface PatientInfoRepo extends JpaRepository<PatientInfo, Integer> {

}
