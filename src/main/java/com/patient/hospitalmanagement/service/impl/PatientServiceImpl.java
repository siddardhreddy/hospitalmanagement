package com.patient.hospitalmanagement.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.hospitalmanagement.entity.Patient;
import com.patient.hospitalmanagement.repo.IPatientRepo;
import com.patient.hospitalmanagement.service.IPatientService;

@Service
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private IPatientRepo patientRepo;
	
	
	@Override
	public void patientRegistration(Patient patient) {
		patient.setRegDate(new Date());
		patientRepo.save(patient);
	}

}
