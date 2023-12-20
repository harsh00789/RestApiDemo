package com.form.login.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form.login.entities.User;

public interface UserDao extends JpaRepository<User,Integer>  {

}
