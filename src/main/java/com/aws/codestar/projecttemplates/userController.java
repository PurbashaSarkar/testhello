package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

	@Autowired
	private userRepository usrRepo;
	
	public userController(userRepository repo) {
		this.usrRepo=repo;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Welcome to user Management.";
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return usrRepo.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> findUsersById(@PathVariable String id){
		return usrRepo.findById(id);
		
	}
	
	@GetMapping("/roles/{role}")
	public User findUserByRole(@RequestParam("role") String role) {		
		return usrRepo.findUserByRole("role");
	}
	
	@GetMapping("/user/{userid}")
	public User findUserByUserID(@RequestParam("userid") String userID) {		
		return usrRepo.findUserByUserID("userID");
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user){
		usrRepo.save(user);
		return user;
	}
	
}
