package com.springrest.restapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {
     
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String content;
	public int getId() {
	
		return id;
	
	}
	public void setId(int id) {
		
		this.id = id;
	
	}
	public String getTitle() {
	
		return title;
	
	}
	public void setTitle(String title) {
	
		this.title = title;
	
	}
	public String getContent() {
	
		return content;
	
	}
	public void setContent(String content) {
		
		this.content = content;
	
	}
	public Courses(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public Courses() {
		super();
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	
	
}
