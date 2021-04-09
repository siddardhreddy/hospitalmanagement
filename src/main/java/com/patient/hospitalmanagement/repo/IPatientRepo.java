package com.patient.hospitalmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patient.hospitalmanagement.entity.Patient;

@Repository
public interface IPatientRepo extends JpaRepository<Patient,Integer> {

}
