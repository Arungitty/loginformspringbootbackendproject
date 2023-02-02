package com.simplilearn.demo.loginform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.loginform.entity.Student;

@Repository
public  interface StudentRepository extends JpaRepository<Student, Integer> {

}


