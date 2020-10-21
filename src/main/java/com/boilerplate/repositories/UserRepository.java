package com.boilerplate.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.boilerplate.models.User;


@Repository
public interface UserRepository extends MongoRepository<User, String>{
	public User findByFirstName(String firstName);
	public User findByEmail(String email);
}
