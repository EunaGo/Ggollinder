package com.ggollinder.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggollinder.web.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	/*
	 * insert : save
	 * select : findById, getOne
	 * update : save
	 * delete : deleteById, delete
	 */

}
