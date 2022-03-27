package com.mindtree.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatientInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String patientName;
	private String mobile;
	private String appointmentDate;
	private String appointmentTime;
	private String selectedDocter;
	public PatientInfo(int id, String patientName, String mobile, String appointmentDate, String appointmentTime,
			String selectedDocter) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.mobile = mobile;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.selectedDocter = selectedDocter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getSelectedDocter() {
		return selectedDocter;
	}
	public void setSelectedDocter(String selectedDocter) {
		this.selectedDocter = selectedDocter;
	}
	public PatientInfo() {
		super();
	}
	
}
