package com.bunfly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bunfly.entity.User;
import com.bunfly.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(Integer id) {
		System.out.println(id);
		User user = userService.getUserById(id);
		System.out.println(user);
		if(user!=null) {
			return "login";
		}
		return "error";
	}

	public UserService getUserService() {
		return userService;
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
