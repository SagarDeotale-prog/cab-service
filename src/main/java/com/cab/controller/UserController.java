package com.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cab.entity.User;
import com.cab.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/hi")
	public String hi() {
		return "hello";
	 }
	
	@GetMapping("/all")
	public List<User>getAllUsers() {
		return userService.getAllUsers();
	 }
	
	@PostMapping
	public void createUser(@RequestBody User user) {
		
		userService.addAll(user);
	}
	  
	 
	 
	
	
}
