package com.simplilearn.demo.loginform.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class DatabaseConnection {
	
private Connection connection=null;
	
	DatabaseConnection(
		   @Value("${spring.datasource.url}") String url,
		   @Value("${spring.datasource.username}") String username,
		   @Value("${spring.datasource.password}") String password) throws SQLException{
		super();
		this.connection=DriverManager.getConnection(url,username,password);    //Here we get our connection object using DriverManager class
	}
			
	@PostConstruct
	public void init() throws SQLException{
		printConnectionDetails();
	
	}
			
	@SuppressWarnings("unused")
	private void printConnectionDetails() throws SQLException{
		System.out.println("Connected to database server"
				+this.connection.getMetaData().getDatabaseProductName()
				+ "version:"
				+this.connection.getMetaData().getDatabaseProductVersion()
				+"/n");
	}
	
	public Connection getConnection() {
		return connection;
	}	
	
}


