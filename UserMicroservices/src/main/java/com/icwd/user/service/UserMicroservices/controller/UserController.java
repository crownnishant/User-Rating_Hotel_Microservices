package com.icwd.user.service.UserMicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icwd.user.service.UserMicroservices.entities.User;
import com.icwd.user.service.UserMicroservices.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	//CREATE
	//we get user object in the form of JSON, to receive all data use RequestBody
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User saveUser = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
		
	}
	
	//GET SINGLE USER
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable ("userId") String userId ){
		
		User singleUser = userService.getSingleUser(userId);
		return ResponseEntity.ok(singleUser);
	}
	
	//GET ALL USERS
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUser(){
		
		List<User> allUsers = userService.getAllUsers();
		return ResponseEntity.ok(allUsers);
	}
}
