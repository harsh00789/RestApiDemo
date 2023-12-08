package com.springrest.restapi.services;

import java.util.List;

import com.springrest.restapi.entities.Courses;

public interface CourceService {

	public List<Courses> courcelist();

	public Courses cource(int id);

	public Courses addcourse(Courses c);

	public Courses updatecourse(int id,Courses c);
	
	
	
	
	
	
}
