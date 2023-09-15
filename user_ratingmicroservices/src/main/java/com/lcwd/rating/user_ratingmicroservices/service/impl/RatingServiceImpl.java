package com.lcwd.rating.user_ratingmicroservices.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.user_ratingmicroservices.entities.Rating;
import com.lcwd.rating.user_ratingmicroservices.repository.RatingRepository;
import com.lcwd.rating.user_ratingmicroservices.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
 		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getRating() {
		// 
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	}

}
