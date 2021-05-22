package com.example.springbootwebsocket.controller;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springbootwebsocket.model.User;
import com.example.springbootwebsocket.model.UserResponse;

@Controller
public class UserController {
	@RequestMapping("/user")
	@SendTo("/topic/user")
	public UserResponse getUser(User user) {
		return new UserResponse("Hello "+user.getName());
	}
}
