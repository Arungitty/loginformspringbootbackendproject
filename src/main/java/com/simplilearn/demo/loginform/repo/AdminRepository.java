package com.simplilearn.demo.loginform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.loginform.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}



