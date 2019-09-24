package com.bit.project.signInOut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignInController {

//	@Autowired
//	private SignInOutService_imp service;
	
	@RequestMapping("/userIndex")
	public String showBoardList() {
		System.out.println("게시판 인덱스로");
		return "user/userIndex";
	}
	
//	@RequestMapping("/userList")
//	public String list(Model model) {
//		
//		List<Users> list = service.listAll();
//		System.out.println(list);
//		model.addAttribute("list",list);
//		
//		return "user";
//	}
	
	
}
