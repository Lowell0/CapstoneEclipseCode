package com.bfpoms.bfpoms.Controller;

import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bfpoms.bfpoms.Entity.UserEntity;
import com.bfpoms.bfpoms.Service.UserService;


@RestController
@RequestMapping ("/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userv;
	
	//Print
	@GetMapping("/print")
	public String printHelloUser() {
		return "Labad Naman!!!";
	}
	
	//get all Users
	@GetMapping("/getAllUser")
	public List<UserEntity> getAllUser(){
		return userv.getAllUser();
	}
	
	//create or insert
	@PostMapping("/add")
	public UserEntity insertUser(@RequestBody UserEntity user) {
		return userv.insertUser(user);
	}
	@PutMapping("/putUser/{id}")
	public UserEntity putUser(@PathVariable int id, @RequestBody UserEntity newUserDetails) throws Exception{
		return userv.putUser(id, newUserDetails);
	}
	//delete a User
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userv.deleteUser(id);
	}
}
