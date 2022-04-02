package com.java.webdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.webdocs.entity.Doctor;
import com.java.webdocs.entity.Hospital;
import com.java.webdocs.repository.HospitalRepository;
@CrossOrigin
@RestController
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
	private HospitalRepository hr;
	
	@PostMapping("/add")
	public void addHospital(@RequestBody Hospital h) {
		hr.save(h);
	}

	@GetMapping("/getAll")
	public List<Hospital> getAllHospitals(){
		return hr.findAll();
	}
}
