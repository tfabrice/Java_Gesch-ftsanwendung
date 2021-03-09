package com.cm.ejb.interfaces;

import java.util.List;

import com.cm.persistence.entities.Customer;

public interface CustomerDAO {		// Daten-Layer (stateless Session Bean) anlegen
	
	// Customer erstellen
	public Customer create(Customer customer);
	
	// Customer-Daten ändern
	public Customer update(Customer customer);
	
	// Customer löschen
	public void remove(int id);
	
	// Eizelner Customer auslesen
	public Customer getCustomer(int id);
	
	// Alle Customer auslesen
	public List<Customer> getAllCustomers();
	
}
