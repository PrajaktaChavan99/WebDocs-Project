package com.java.webdocs.entity;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="patient")
public class Patient {
	
	@Id
	@Column(name="Patient_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="Patient_Name")
	private String name;
	
	@Column(name="Patient_Photo")
	private String photo;
	
	@Column(name="Patient_DOB")
	private Date date;
	
	@Column(name="Patient_Gender")
	private String gender;
	
	@Column(name="Patient_Mobile_number")
	private String mobileNo;
	
	@Column(name="Patient_Email")
	private String email;
	
	@Column(name="Patient_Username")
	private String username;
	
	@Column(name="Patient_Password")
	private String password;
	
	public Patient() {
		super();
	}
	
	public Patient(String name, String photo, Date date, String gender, String mobileNo, String email,
			String username, String password) {
		super();
		this.name = name;
		this.photo = photo;
		this.date = date;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Patient(int id, String name, String photo, Date date, String gender, String mobileNo, String email,
			String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.date = date;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", photo=" + photo + ", date=" + date + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", email=" + email + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
}
