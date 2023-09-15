package com.lcwd.hotel.hotelmicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.hotelmicroservices.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

	//we can write custom finder method
}
