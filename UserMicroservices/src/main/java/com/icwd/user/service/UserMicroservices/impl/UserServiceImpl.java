package com.icwd.user.service.UserMicroservices.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.icwd.user.service.UserMicroservices.entities.Rating;
import com.icwd.user.service.UserMicroservices.entities.User;
import com.icwd.user.service.UserMicroservices.exception.ResourceNotFoundException;
import com.icwd.user.service.UserMicroservices.repository.UserRepository;
import com.icwd.user.service.UserMicroservices.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger=LoggerFactory.getLogger(UserService.class);
	
	@Override
	public User saveUser(User user) {
		//generate unique random userid (not use @generatedvalue this time) 
		//return this.userRepository.save(user);
		String randomId = UUID.randomUUID().toString();
		user.setUserId(randomId);
		return userRepository.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		
		return this.userRepository.findAll();
	}

	@Override
	public User getSingleUser(String userId) {
		// always throw exception while using orElseThrow
		//create custom exception which extends RuntimeException
		
		User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user with the given id not in server"));
		
		//http://localhost:8083/ratings/users/cf750cc9-b825-44d4-a23f-7b30ddcf2aeb, "type of object you expect"
		//fetch rating given by above user
		ArrayList<Rating> ratingOfUser = restTemplate.getForObject("http://localhost:8083/ratings/users/"+user.getUserId(), ArrayList.class);
		logger.info("{}", ratingOfUser);
		
		user.setRating(ratingOfUser);
		return user;
	}

}
