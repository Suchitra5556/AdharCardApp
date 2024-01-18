package com.student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepo;
import com.student.service.StudentService;

@Service
public class StudentImpl implements StudentService {
	
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		Student stud = studentRepo.save(student);
		return stud;
	}

	@Override
	public List<Student> saveStudents(List<Student> students) {
		
		 List<Student> studs=studentRepo.saveAll(students);
		 return studs;
	}
	
	
}
