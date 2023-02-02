package com.simplilearn.demo.loginform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.loginform.entity.Admin;
import com.simplilearn.demo.loginform.repo.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repo2;
	
	//add admin details
		public Admin addAdminDetails(Admin admin) {
			return repo2.save(admin);
		}
		
		// List of admin details
		public List<Admin> getAllAdminDetails(){
			return repo2.findAll();
		}

}


