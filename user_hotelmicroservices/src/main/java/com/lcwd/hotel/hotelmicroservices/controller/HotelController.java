package com.lcwd.hotel.hotelmicroservices.controller;

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

import com.lcwd.hotel.hotelmicroservices.entities.Hotel;
import com.lcwd.hotel.hotelmicroservices.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	//Create
	@PostMapping("/")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}
	//Get Single Hotel
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> singleHotel(@PathVariable ("id") String id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.SingleHotel(id));
	}
	//Get All hotel
	
	@GetMapping("/")
	public ResponseEntity<List<Hotel>> getAllHotel()
	{
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotel());
	}

}
