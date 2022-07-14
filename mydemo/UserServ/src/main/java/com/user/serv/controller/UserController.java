package com.user.serv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.serv.entity.Users;
import com.user.serv.repository.UserRepository;
import com.user.serv.service.UserService;

@ComponentScan(basePackages = "com")
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository repository;

	@PostMapping("/createUser")
	public void addUser(@RequestBody Users newUser) {
		if(newUser.getroles()!="admin") 
			newUser.setroles("non-admin");
		userService.createUser(newUser);
	}

	@GetMapping("/readAllUsers")
	public Iterable<Users> readAllUsers() {

		return userService.displayAllUser();
	}

	@PutMapping("/updateUser")
	public void updateUser(@RequestBody Users updateUser) {

		userService.updateUser(updateUser);
	}
	
	@GetMapping("/searchUser/{id}")
	public ResponseEntity<?> searchUserByID(@PathVariable("id") Integer userId) {

		return userService.findUserById(userId);
	}

	@DeleteMapping("/deleteUser/{id}")
	public void deleteBookingByID(@PathVariable("id") Integer userId) {

		userService.deleteUser(userId);
	}
	
	@GetMapping("/getrole")
	public ResponseEntity<?> getRole(@RequestBody String username) {
		return repository.getrole(username);
	}
}