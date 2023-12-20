package com.form.login.services;

import java.util.List;

import com.form.login.entities.User;

public interface UserService {
	
	public User adduser(User u);
	
	public List<User> getusers();

}
