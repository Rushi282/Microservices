package com.cdac.app.service;

import java.util.List;

import com.cdac.app.entity.Contacts;

public interface IContactService {

	List<Contacts> getContactsById(Long userId);
}
