package com.cdac.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cdac.app.entity.Contacts;

@Service
public class ContactServiceImpl implements IContactService {

	List<Contacts> contacts = List.of(new Contacts(1l, "abhi@gmail.com", 9876678990l, 2801l),
			new Contacts(2l, "abhi@gmail.com", 6754294754l, 2801l),
			new Contacts(3l, "rushi.majale.com", 7588249523l, 2802l),
			new Contacts(4l, "rushimajale5453@gmail.com", 9823704144l, 2802l),
			new Contacts(5l, "sanket@gmail.com", 1234567890l, 2803l),
			new Contacts(6l, "patil.sanket@gmail.com", 9876546786l, 2803l),
			new Contacts(7l, "sankyfanky@gmail.com", 9876543215l, 2803l));

	@Override
	public List<Contacts> getContactsById(Long userId) {
		return contacts.stream().filter(contact -> contact.getUserId().equals(userId))
				.collect(Collectors.toList());
	}

}
