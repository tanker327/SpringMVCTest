package com.tanker.springmvc.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tanker.springmvc.dao.ContactDao;
import com.tanker.springmvc.form.Contact;

@Repository
public class ContactDaoImpl implements ContactDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override

	public void addContact(Contact contact) {
		System.out.println("Dao");
		sessionFactory.getCurrentSession().save(contact);
	}

}
