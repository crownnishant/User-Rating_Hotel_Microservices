package com.lcwd.rating.user_ratingmicroservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.rating.user_ratingmicroservices.entities.Rating;

@Service
public interface RatingService {

	//CREATE
	Rating createRating(Rating rating);
	
	//GET ALL
	
	List<Rating> getRating();
	
	//GET SINGLE
	
	List<Rating> getRatingByUserId(String userId);
	
}
