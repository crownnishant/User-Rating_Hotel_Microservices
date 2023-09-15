package com.icwd.user.service.UserMicroservices.services;

import java.util.List;

import com.icwd.user.service.UserMicroservices.entities.User;

public interface UserService {
	
	
	//CREATE 
	
	User saveUser(User user);
	
	//GET ALL USERS with no parameter because we need all the users
	
	List<User> getAllUsers();
	
	//GET SINGLE USER
	
	User getSingleUser(String userId);
	

}
