package com.boilerplate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boilerplate.models.User;
import com.boilerplate.services.UserService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/create")
	public User create(@RequestBody User user) {
		User u = userService.create(user.getFirstName(), user.getLastName(),user.getEmail());				
		return u;
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/update")
	public String update(@RequestBody User user) {
		User u = userService.updateUser(user.getFirstName(), user.getLastName(), user.getEmail());
		return "User Updated Successfully";
	}
	
	@RequestMapping("/get/{id}")
	public User getUserByUserId(@PathVariable("id") String id) {
		User user = userService.getById(id);
		return user;
	}

	@RequestMapping("/getAll")
	public List<User> getUserFromEmail() {
		return userService.getAll();
	}
}
