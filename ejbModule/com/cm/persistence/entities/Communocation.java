package com.cm.persistence.entities;

import java.sql.Timestamp;

import com.cm.persistence.enums.CommunicationType;
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
public class Communocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Size(max = 100)
	private String value;
	
	@NotNull
	@Size(max = 20)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private CommunicationType communicationType;
	
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CommunicationType getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(CommunicationType communicationType) {
		this.communicationType = communicationType;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	
	
}
