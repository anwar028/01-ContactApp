package com.ashokit.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Contact;
import com.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public boolean saveContact(Contact contact) {
		
  Contact save = contactRepo.save(contact);
  
  if(save!=null && save.getContactId != null) {
	  return true;
  }
	
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
	  List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = contactRepo.findById(contactId);
		
		if(findById.isPresent()) {
		Contact contact =	findById.get();
		
		return contact;
		}
		return null;
	}

	@Override
	public boolean deleateContactById(Integer contactId) {
	boolean status = contactRepo.existsById(contactId);
	
	if(status) {
		contactRepo.deleteById(contactId);
		return true;
	}
		return false;
	}

}
