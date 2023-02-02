package com.simplilearn.demo.loginform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.loginform.entity.Student;
import com.simplilearn.demo.loginform.repo.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo1;
	
	//add student details
		public Student addStudentDetails(Student student2) {
			return repo1.save(student2);
		}
		
		// List student Details 
		public List<Student> getAllStudentDetails(){
			return repo1.findAll();
		}
		
}




