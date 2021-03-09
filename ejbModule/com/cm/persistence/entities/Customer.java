package com.cm.persistence.entities;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.cm.persistence.enums.Gender;
import com.cm.persistence.enums.Relationship;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String firstname;
	
	@NotNull
	@Size(min = 1, max = 100)
	private String lastname;
	
	private Gender gender;
	
	private Relationship relationship;
	
	private Date birthday;
	
	
	/* 
	 - Liste von Adresse und Kommunikationsmethode
	 - Wenn eine Änderung auf Adressse aufgenommen wird, wird die Änderung auch hier berücksichtigt. Durch "cascade = CascadeType.ALL"
	 - Wenn ein Mitarbeiter gelöscht wird, muss auch seine Daten automatisch gelöscht werden. Dafür benutzt man "orphanRemoval = true"
	*/
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Address> addresses;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Communocation> communications;
	
	
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Relationship getRelationship() {
		return relationship;
	}

	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Communocation> getCommunications() {
		return communications;
	}

	public void setCommunications(List<Communocation> communications) {
		this.communications = communications;
	}
	
	
	
	
}
