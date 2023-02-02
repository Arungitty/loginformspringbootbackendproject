package com.simplilearn.demo.loginform;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.loginform.entity.Student;
import com.simplilearn.demo.loginform.service.StudentService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/studentdetails")
public class StudentController {
	
	@Autowired
	private StudentService service1;
	
	///create new record
	@PostMapping("/")
	public ResponseEntity<Student> addStudentDetails(@RequestBody Student student2){
		Student student1= service1.addStudentDetails(student2);
		if(student1!=null)  
			return new ResponseEntity<Student>(student1, HttpStatus.CREATED);
		else
			return new ResponseEntity<Student>(student1, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//get all student details
	@GetMapping("/")
	public List<Student> getAllStudentDetails(){
		return service1.getAllStudentDetails();
	}

}
