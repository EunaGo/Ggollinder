package com.ggollinder.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ggollinder.web.entity.User;
import com.ggollinder.web.repository.UserRepository;

@Controller
public class MainController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@RequestMapping("/main")
	public String main(Model model) {
		
//		System.out.println("[select]");
//		
//		List<User> result = userRepository.findAll();
//		System.out.println(result);
//		
//		System.out.println("======================");
//		
//		Optional<User> user = userRepository.findById("1");
//		System.out.println(user);
		
		User user = new User();
		user.setUserId("eunago2");
		user.setUserPassword("1111");
		user.setUserName("Àº¾Æ°í");
		
		
		return "main";
	}
	
}
