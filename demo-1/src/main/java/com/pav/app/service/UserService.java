package com.pav.app.service;

import com.pav.app.model.User;

public interface UserService {
	  
	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
	}
