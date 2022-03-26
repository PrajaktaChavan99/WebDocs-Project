package com.java.webdocs.entity;
import java.sql.Blob;
import java.sql.Date;
import java.util.List;

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

@Entity (name="doctor")
public class Doctor {
			
		@Id
		@Column(name="Doctor_Id")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(name="Doctor_Name")
		private String name;
		
		@Column(name="Doctor_Photo")
		private String photo;
		
		@Column(name="Doctor_DOB")
		private Date date;
		
		@Column(name="Doctor_Gender")
		private String gender;
		
		@Column(name="Doctor_Mobile_number")
		private String mobileNo;
		
		@Column(name="Doctor_Email")
		private String email;
		
		@Column(name="Doctor_License_Number")
		private String licenseNo;
		
		//@Column(name="Doctor_Category_Id")
		//@JoinColumn(name="Category_id")
		@ManyToOne
		private Category category;
		
		//@Column(name="Doctor_Hospital_Id")
		@ManyToOne
		//@JoinColumn(name="Hospital_id")
		private Hospital hospital;
		
		@Column(name="Doctor_Experience ")
		private int experience;
		
		@Column(name="Doctor_Fees")
		private int fees;
		
		@Column(name="Doctor_Username")
		private String username;
		
		@Column(name="Doctor_Password")
		private String password;

		public Doctor() {
			super();
		}

		public Doctor(int id, String name, String photo, Date date, String gender, String mobileNo, String email,
				String licenseNo, Category category, Hospital hospital, int experience, int fees, String username,
				String password) {
			super();
			this.id = id;
			this.name = name;
			this.photo = photo;
			this.date = date;
			this.gender = gender;
			this.mobileNo = mobileNo;
			this.email = email;
			this.licenseNo = licenseNo;
			this.category = category;
			this.hospital = hospital;
			this.experience = experience;
			this.fees = fees;
			this.username = username;
			this.password = password;
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

		public String getPhoto() {
			return photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getLicenseNo() {
			return licenseNo;
		}

		public void setLicenseNo(String licenseNo) {
			this.licenseNo = licenseNo;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public Hospital getHospital() {
			return hospital;
		}

		public void setHospital(Hospital hospital) {
			this.hospital = hospital;
		}

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		public int getFees() {
			return fees;
		}

		public void setFees(int fees) {
			this.fees = fees;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Doctor [id=" + id + ", name=" + name + ", photo=" + photo + ", date=" + date + ", gender=" + gender
					+ ", mobileNo=" + mobileNo + ", email=" + email + ", licenseNo=" + licenseNo + ", category="
					+ category + ", hospital=" + hospital + ", experience=" + experience + ", fees=" + fees
					+ ", username=" + username + ", password=" + password + "]";
		}

}
