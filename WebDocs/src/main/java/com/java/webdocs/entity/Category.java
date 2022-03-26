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

@Entity (name="Category")
public class Category {
	
	@Id
	@Column(name="Category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany(targetEntity=Doctor.class,cascade=CascadeType.ALL)
	//@OneToMany(mappedBy = "Doctor_Hospital_Id")
	@JoinColumn(name="Doctor_Id")
	private Set<Doctor> doctor;
	
	@Column(name="Specialization")
	private String specialization;
	
	@Column(name="Description")
	private String description;

	public Category() {
		super();
	}

	public Category(int id, Set<Doctor> doctor, String specialization, String description) {
		super();
		this.id = id;
		this.doctor = doctor;
		this.specialization = specialization;
		this.description = description;
	}

	

	public Set<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(Set<Doctor> doctor) {
		this.doctor = doctor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", specialization=" + specialization + ", description=" + description + "]";
	}
	
	
}
