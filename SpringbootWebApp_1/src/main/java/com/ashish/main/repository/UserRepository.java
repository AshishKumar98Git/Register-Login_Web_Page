package com.ashish.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.main.entities.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);

}
