package com.scofield.healthconnect.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scofield.healthconnect.api.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	
}
