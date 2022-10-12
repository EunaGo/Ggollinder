package com.ggollinder.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ggollinder.web.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	/*
	 * insert : save
	 * select : findById, getOne
	 * update : save
	 * delete : deleteById, delete
	 */
	
	@Query(value = "SELECT * FROM TB_USER WHERE USER_ID = :userId AND USER_PASSWORD = :userPwd", nativeQuery = true)
	User findByUserIdAndPwd(@Param("userId") String userId, @Param("userPwd") String userPwd);

}