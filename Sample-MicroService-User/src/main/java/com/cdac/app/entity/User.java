package com.cdac.app.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Long userId;
	private String name;
	private String city;
	List<Contacts> contacts = new ArrayList<>();
	
	
	public User(Long userId, String name, String city) {
		super();
		this.userId = userId;
		this.name = name;
		this.city = city;
	}
	
	
}
