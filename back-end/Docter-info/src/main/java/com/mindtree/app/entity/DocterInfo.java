package com.mindtree.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class DocterInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String docterName;
	private String mobile;
	private int age;
	private String gender;
	private String specialization;
	public DocterInfo(int id, String docterName, String mobile, int age, String gender, String specialization) {
		super();
		this.id = id;
		this.docterName = docterName;
		this.mobile = mobile;
		this.age = age;
		this.gender = gender;
		this.specialization = specialization;
	}
	public DocterInfo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocterName() {
		return docterName;
	}
	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}
