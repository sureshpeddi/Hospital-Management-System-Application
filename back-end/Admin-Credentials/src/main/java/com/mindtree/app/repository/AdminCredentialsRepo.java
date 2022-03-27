package com.mindtree.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.app.entity.AdminCredetials;

@Repository
public interface AdminCredentialsRepo extends JpaRepository<AdminCredetials, Integer> {

}
