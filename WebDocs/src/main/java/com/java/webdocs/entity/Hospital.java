package com.java.webdocs.entity;
import java.sql.Blob;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity (name="Hospital")
public class Hospital {
	
	@Id
	@Column(name="Hospital_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@Column(name="Doctor_Id")
	@OneToMany(targetEntity=Doctor.class,cascade=CascadeType.ALL)
	//@OneToMany(mappedBy = "Doctor_Hospital_Id")
	@JoinColumn(name="Doctor_Id")
	private Set<Doctor> doctor;

	@Column(name="Hospital_Name")
	private String name;
	
	@Column(name="Hospital_Address")
	private String address;
	
	@Column(name="Hospital_Image")
	private String image;

	public Hospital() {
		super();
	}

	public Hospital(int id, String name, String address, String image) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", address=" + address + ", image=" + image + "]";
	}
		
}
