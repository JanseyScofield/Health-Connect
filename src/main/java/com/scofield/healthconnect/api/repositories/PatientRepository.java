package com.scofield.healthconnect.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scofield.healthconnect.api.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
	
}