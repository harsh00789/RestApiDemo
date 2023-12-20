package com.form.login.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form.login.Repositories.UserDao;
import com.form.login.entities.User;

@Service
public class UserServiceImpl implements UserService {
     
	@Autowired
	private UserDao ud;
	
	@Override
	public User adduser(User u) {
		
	 return	ud.save(u);
		
	}

	@Override
	public List<User> getusers() {
		
	  List<User> users = ud.findAll();
		
	return 	users;
		
	}

}
