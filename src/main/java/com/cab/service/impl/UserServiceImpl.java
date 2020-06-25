package com.cab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.entity.User;
import com.cab.repository.UserRepository;
import com.cab.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public void addAll(User user) {

		userRepository.save(user);
		
	}
}
