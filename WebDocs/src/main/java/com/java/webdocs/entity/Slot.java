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

@Entity (name="Slot")
public class Slot {

	@Id
	@Column(name="slot_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="Slot_Doctor_id")
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Doctor_Id")
    private Set<Doctor> doctors;
	
	@Column(name="Hospital_id")
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Hospital_id")
    private Set<Hospital> hospitals;

	@Column(name="Slot_Date")
	private Date date;
	
	@Column(name="Slot_Start_Time")
	private Time startTime;
	
	@Column(name="Slot_End_Time")
	private Time endTime ;

	public Slot() {
		super();
	}

	public Slot(int id, Set<Doctor> doctors, Set<Hospital> hospitals, Date date, Time startTime, Time endTime) {
		super();
		this.id = id;
		this.doctors = doctors;
		this.hospitals = hospitals;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}

	public Set<Hospital> getHospitals() {
		return hospitals;
	}

	public void setHospitals(Set<Hospital> hospitals) {
		this.hospitals = hospitals;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Slot [id=" + id + ", doctors=" + doctors + ", hospitals=" + hospitals + ", date=" + date
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
}
