package com.simplilearn.demo.loginform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo.loginform")
public class SpringBootStudentAdminLoginform1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentAdminLoginform1Application.class, args);
		System.out.println("My spring boot application is working");
	}

}



