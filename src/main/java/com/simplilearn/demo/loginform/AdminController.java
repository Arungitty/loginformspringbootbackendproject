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

import com.simplilearn.demo.loginform.entity.Admin;
import com.simplilearn.demo.loginform.service.AdminService;



@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/admindetails")

public class AdminController {
	
	@Autowired
	private AdminService service2;
	
	///create new record
	@PostMapping("/")
	public ResponseEntity<Admin> addAdminDetails(@RequestBody Admin admin2){
		Admin admin1= service2.addAdminDetails(admin2);
		if(admin1!=null)  
			return new ResponseEntity<Admin>(admin1, HttpStatus.CREATED);
		else
			return new ResponseEntity<Admin>(admin1, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//get all admin details
	@GetMapping("/")
	public List<Admin> getAllAdminDetails(){
		return service2.getAllAdminDetails();
	}

}


