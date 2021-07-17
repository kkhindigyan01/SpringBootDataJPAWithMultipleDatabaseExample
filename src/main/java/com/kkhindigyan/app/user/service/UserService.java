package com.kkhindigyan.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkhindigyan.app.user.dao.UserRepository;
import com.kkhindigyan.app.user.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public Iterable<User> fetchAllUsers(){
		return userRepository.findAll();
	}
}
