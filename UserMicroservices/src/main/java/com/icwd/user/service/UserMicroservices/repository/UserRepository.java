package com.icwd.user.service.UserMicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icwd.user.service.UserMicroservices.entities.User;

public interface UserRepository extends JpaRepository<User, String> {


	//we can add any custom finder method if we wish to
	
}
