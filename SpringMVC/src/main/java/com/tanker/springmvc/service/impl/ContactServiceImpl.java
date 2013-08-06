package com.tanker.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tanker.springmvc.dao.ContactDao;
import com.tanker.springmvc.form.Contact;
import com.tanker.springmvc.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDao contactDao;
	
	@Override
	@Transactional
	public void addContact(Contact contact) {
		contactDao.addContact(contact);
		System.out.println("service");
	}

}
