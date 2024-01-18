package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
	
	@Id
	Integer id;
	String name;
	int mark;
	
	
	

}
