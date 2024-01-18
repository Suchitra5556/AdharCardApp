package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.serviceImpl.StudentImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentImpl studentImpl;
	
	@PostMapping("/save")
	Student savestud(@RequestBody Student student)
	{
		return studentImpl.saveStudent(student);
	}
	
	@PostMapping("/saveAll")
	List<Student> savestud(@RequestBody List<Student> students)
	{
		return studentImpl.saveStudents(students);
	}

}
