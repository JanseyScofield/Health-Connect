package com.scofield.healthconnect.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Person person;
	@Column(length = 10, nullable = false)
	private String crm;
	@Enumerated(EnumType.STRING)
    private Specialty categoria;
	
	public Long getId() {
		return id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public Specialty getCategoria() {
		return categoria;
	}
	public void setCategoria(Specialty categoria) {
		this.categoria = categoria;
	}
}