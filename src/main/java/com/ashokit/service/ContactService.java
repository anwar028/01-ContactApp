package com.ashokit.service;

import com.ashokit.entity.Contact;
import java.util.List;



public interface ContactService {
	
	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public boolean deleateContactById(Integer contactId);
	

}
