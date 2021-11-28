package com.ascentpro.userservice.entity;

import java.util.ArrayList;
import java.util.List;
import com.ascentpro.userservice.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	 
	 List<User> list= new  ArrayList<User>();
	  
	
	@Override
	public User getUser(Long id) {
		 return list.stream().filter( user->user.getUserid().equals(id)).findAny().orElse(null);
	}

 
	 
	 
	

	 




 
}
