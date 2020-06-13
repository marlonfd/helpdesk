package com.marlondirksen.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marlondirksen.helpdesk.api.security.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByEmail(String email);	

}
