package com.example.SpringLoginAndRegister.service;

import com.example.SpringLoginAndRegister.model.User;

public interface UserService {
	
	public User findUserByEmail(String email);
	 
	 public void saveUser(User user);

}
