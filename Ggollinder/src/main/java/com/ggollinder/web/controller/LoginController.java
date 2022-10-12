package com.ggollinder.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ggollinder.util.EncryptionUtil;
import com.ggollinder.web.entity.User;
import com.ggollinder.web.repository.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@RequestMapping("/actionLogin")
	public String actionLogin(Model model) {
		
		EncryptionUtil encrypt = new EncryptionUtil();
		
		String pwd = encrypt.getSHA256("1234");
		
		User user = userRepository.findByUserIdAndPwd("eunago", pwd);
		
		System.out.println(user);
		
		if(user == null) return "redirect:/login";
		
		model.addAttribute("user", user);
		
		return "main";
	}
}
