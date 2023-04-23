package com.cdac.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {
	
	private Long cId;
	private String email;
	private Long phone;
	private Long userId;
}
