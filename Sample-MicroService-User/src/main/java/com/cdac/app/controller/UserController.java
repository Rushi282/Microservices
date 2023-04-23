package com.cdac.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cdac.app.entity.User;
import com.cdac.app.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private RestTemplate restTemp;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = userService.getUserById(userId);
		
		//http://localhost:9002/contact/user/2802
		
		List contacts = restTemp.getForObject("http://localhost:9002/contact/user/"+user.getUserId(), List.class);
		
		user.setContacts(contacts);
		
		return user;
	}

}
