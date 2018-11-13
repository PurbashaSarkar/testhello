package com.example.demo;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface userRepository extends MongoRepository<User, String> {

	 public User findUserByRole(String role);
	 
	 public User findUserByUserID(String userID);
	 
	}


