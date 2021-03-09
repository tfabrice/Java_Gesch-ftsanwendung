package com.cm.ejb.beans;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

import com.cm.ejb.interfaces.CustomerDAO;
import com.cm.persistence.entities.Customer;

@Stateless					
@Remote(CustomerDAO.class)  // hier wird für Remote Interface die Klasse "CustomerDAO" verwendet
public class CustomerBean implements CustomerDAO {
	
	@PersistenceContext			// ist benutzt, um CRUD-Operationen auszuführen
	private EntityManager em;

	@Override
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
