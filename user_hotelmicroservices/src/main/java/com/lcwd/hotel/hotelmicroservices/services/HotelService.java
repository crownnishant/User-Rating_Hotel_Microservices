package com.lcwd.hotel.hotelmicroservices.services;

import java.util.List;

import com.lcwd.hotel.hotelmicroservices.entities.Hotel;

public interface HotelService {
	
	//CREATE OR SAVE
	
	Hotel create(Hotel hotel);
	
	
	//GET SINGLE HOTEL
	Hotel SingleHotel(String id);
	
	//GET ALL LIST OF HOTEL

	List<Hotel> getAllHotel();
}
