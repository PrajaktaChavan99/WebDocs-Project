package com.java.webdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.webdocs.entity.Doctor;
import com.java.webdocs.repository.dao.DoctorDAO;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorDAO dao;
	
	@GetMapping("/add")
	public void addDoc(@RequestBody Doctor doctor)
	{
		dao.addDoctor(doctor);
		System.out.println("Doctor added successfully");
	}
}
