package com.cdac.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cdac.app.entity.User;

@Service
public class UserServiceImpl implements IUserService {

	List<User> users = List.of(new User(2801l, "Abhishek Kadam", "Kolhapur"),
			new User(2802l, "Rushikesh Majale", "Sangaon"), new User(2803l, "Sanket Patil", "Malkapur"));

	@Override
	public User getUserById(Long userId) {

		return users.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
	}

}
