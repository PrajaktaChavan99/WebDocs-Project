package com.java.webdocs.entity;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Time;
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

@Entity (name="Appointment")
public class Appointment {

	@Id
	@Column(name="Appointment_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="Appointment_slot_id")
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="slot_id")
    private Set<Slot> slots;
	
	@Column(name="Appointment_Doctor_id")
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Doctor_Id")
    private Set<Doctor> doctors;
	
	@Column(name="Appointment_Patient_id")
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Patient_Id")
    private Set<Patient> patients;
	
	@Column(name="Appointment_Status")
	private boolean status;

	public Appointment() {
		super();
	}

	public Appointment(int id, Set<Slot> slots, Set<Doctor> doctors, Set<Patient> patients, boolean status) {
		super();
		this.id = id;
		this.slots = slots;
		this.doctors = doctors;
		this.patients = patients;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Slot> getSlots() {
		return slots;
	}

	public void setSlots(Set<Slot> slots) {
		this.slots = slots;
	}

	public Set<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}

	public Set<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", slots=" + slots + ", doctors=" + doctors + ", patients=" + patients
				+ ", status=" + status + "]";
	}
	
}
