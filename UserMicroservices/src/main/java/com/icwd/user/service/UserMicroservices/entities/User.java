package com.icwd.user.service.UserMicroservices.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name="micro_users")
public class User {

	@Id
	@Column(name="ID")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	
	@Column(name="NAME")
	private String userName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ABOUT")
	private String about;
	
	
	//jpa wont store it in DB
	@Transient
	private List<Rating> rating;
	
	
}
