package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService
{
	Student saveStudent(Student student);
	List<Student> saveStudents(List<Student> students);
}
