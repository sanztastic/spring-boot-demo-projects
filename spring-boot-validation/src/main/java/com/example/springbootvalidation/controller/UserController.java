package com.example.springbootvalidation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springbootvalidation.model.UserModel;

@Controller
public class UserController {
	@RequestMapping("add")
	public String toAdd(UserModel user) {
		return "add";
	}
	
	@RequestMapping("addUser")
	public String add(@Valid UserModel user, BindingResult result) {
		if(result.hasErrors()) {
			return "add";
		}
		System.out.println("Save user = "+ user);
		return "success";
	}
	
}
