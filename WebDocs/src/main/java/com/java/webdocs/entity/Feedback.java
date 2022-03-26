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

@Entity (name="Feedback")
public class Feedback {

	@Id
	@Column(name="Feedback_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="Feedback_Patient_Id")
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Patient_Id")
    private Set<Patient> patients;
	
	@Column(name="Feedback_Doctor_Id")
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Doctor_Id")
    private Set<Doctor> doctors;
		
	@Column(name="Feedback_Text")
	private String feedbackText;
	
	@Column(name="Feedback_Rating")
	private int feedbackRating;

	public Feedback() {
		super();
	}

	public Feedback(int id, Set<Patient> patients, Set<Doctor> doctors, String feedbackText, int feedbackRating) {
		super();
		this.id = id;
		this.patients = patients;
		this.doctors = doctors;
		this.feedbackText = feedbackText;
		this.feedbackRating = feedbackRating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}

	public Set<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}

	public String getFeedbackText() {
		return feedbackText;
	}

	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}

	public int getFeedbackRating() {
		return feedbackRating;
	}

	public void setFeedbackRating(int feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", patients=" + patients + ", doctors=" + doctors + ", feedbackText="
				+ feedbackText + ", feedbackRating=" + feedbackRating + "]";
	}
	
}
