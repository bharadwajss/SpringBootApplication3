package com.ascentpro.userservice.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ascentpro.userservice.entity.User;
import com.ascentpro.userservice.entity.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userid}")
	public User getUser(@PathVariable("userid") Long userid)
	{
		User user= this.service.getUser(userid);
		List contacts =this.restTemplate.getForObject(""+user.getUserid(), List.class);
		//user.setContacts(contacts);
		return user;
	}
	

}
