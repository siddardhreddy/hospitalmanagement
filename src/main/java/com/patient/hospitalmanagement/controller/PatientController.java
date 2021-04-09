package com.patient.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.hospitalmanagement.entity.Patient;
import com.patient.hospitalmanagement.service.IPatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
	
	@Autowired
	private IPatientService patientService;
	
	@PostMapping("/register")
	public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient){
		patientService.patientRegistration(patient);
		return new ResponseEntity<Patient>(patient,HttpStatus.CREATED);
	}
}
