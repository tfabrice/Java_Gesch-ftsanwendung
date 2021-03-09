package com.cm.persistence.entities;

import java.sql.Timestamp;

import com.cm.persistence.enums.Kind;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Size(max = 100)
	private String street;
	
	@NotNull
	@Size(max = 100)
	private String city;
	
	@NotNull
	@Size(max = 10)
	private String zip;
	
	@NotNull
	@Size(max = 50)
	private String country;
	
	@Enumerated(EnumType.STRING)
	private Kind kind;
	
	
	// Sperrung von Datensätze mit der optimischen Sperrung
	@Version
	private Timestamp lastChanged;
	
	
	
	
	// Getters und Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	
	
	
}
