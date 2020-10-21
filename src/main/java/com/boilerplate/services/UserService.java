package com.boilerplate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boilerplate.models.User;
import com.boilerplate.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User create(String firstName, String lastName, String email) {

		return userRepository.save(new User(firstName, lastName, email));
	}

	// Read
	public List<User> getAll() {
		return userRepository.findAll();
	}

	public User getById(String id) {
		return userRepository.findById(id).orElse(null);
	}

	public User getByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	// Update
	public User updateUser(String firstName, String lastName, String email) {
		User u = userRepository.findByEmail(email);
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setEmail(email);

		return userRepository.save(u);
	}

	// Delete
	public void deleteAll() {
		userRepository.deleteAll();
	}

	public void deleteByEmail(String email) {
		User u = userRepository.findByEmail(email);
		userRepository.delete(u);

	}

}
