package com.cab.service;

import java.util.List;

import com.cab.entity.User;

public interface UserService {

	List<User> getAllUsers();

	void addAll(User user);
	
	
}
