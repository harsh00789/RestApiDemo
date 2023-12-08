package com.springrest.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.restapi.dao.CourseDao;
import com.springrest.restapi.entities.Courses;

@Service
public class CourceServiceImpl {
    
	@Autowired
	private CourseDao cdao; 
	
	//List<Courses> courses = 	new ArrayList<Courses>();
	
//	public Courses CourceServiceImpl(Courses c) {
//	
////		courses.add(new Courses(1,"java","this is java"));
////		courses.add(new Courses(2,"python","this is python"));
////		
//	return	cdao.save(c);
//		
//	}
	
	

	public List<Courses> courcelist() {
		// TODO Auto-generated method stub
	
		return cdao.findAll();
		
	}

	public Courses cource(int id) {
		// TODO Auto-generated method stub
//		Courses c =null;
//		
//		for(Courses course : courses) {
//			
//		  if(course.getId()==id) {
//			  c = course;
//		  }
//			
//		}
//		
//		return c;
		
	
	Courses c = cdao.findById(id).get();
	return c;
		
		
	}



	public Courses addcourse(Courses c) {
		// TODO Auto-generated method stub
		
	cdao.save(c);
	return c;
		
	}


	
	public Courses updatecourse(Courses co) {
		// TODO Auto-generated method stub
		
//		Courses c=null;
//		for(Courses course : courses) {
//			
//			if(course.getId()==id) {
//				
//				course.setTitle(co.getTitle());
//				course.setContent(co.getContent());
//				c=course;
//			}
//			
//		}
//		
//		return c;
		
	return	cdao.save(co);
		
	}
}
