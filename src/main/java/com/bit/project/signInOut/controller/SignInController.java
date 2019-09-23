package com.bit.project.signInOut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.project.signInOut.dto.Users;
import com.bit.project.signInOut.service.SignInOutService_imp;

@Controller
public class SignInController {

	@Autowired
	private SignInOutService_imp service;
	
	@RequestMapping("/userList")
	public String list(Model model) {
		
		List<Users> list = service.listAll();
		System.out.println(list);
		model.addAttribute("list",list);
		
		return "user";
	}
	
	
}
