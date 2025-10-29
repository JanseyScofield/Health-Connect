package com.scofield.healthconnect.api.entities;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Address {
	@NotBlank(message = "Logradouro can't be null or empty")
	private String logradouro;
	private String number;
	private String complement;
	@NotBlank(message = "Neighborhood can't be null or empty")
	private String neighborhood;
	@NotBlank(message = "City can't be null or empty")
	private String city;
	@NotBlank(message = "UF can't be null or empty")
	private String uf;
	@NotBlank(message = "CEP can't be null or empty")
	private String cep;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
