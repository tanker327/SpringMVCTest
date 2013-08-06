package com.tanker.springmvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.tanker.springmvc.dao.ContactDao;
import com.tanker.springmvc.form.Contact;

@Repository
public class ContactDaoImpl implements ContactDao {

	@Override
	public void addContact(Contact contact) {
		System.out.println("Dao");
	}

}
