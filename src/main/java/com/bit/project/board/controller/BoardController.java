package com.bit.project.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.project.board.dto.BoardDto;
import com.bit.project.board.service.IBoardService;

@Controller
public class BoardController {
	@Autowired
	private IBoardService service;
	
	@RequestMapping("/")
	public String root() {
//		model.addAttribute("list", service.listDao());
		System.out.println("/걸림");
		return "index";
	}

	@RequestMapping("/boardList")
	public String showBoardList(Model model) {
//		model.addAttribute("list", service.listDao());
		return "boardList";
	}

	@RequestMapping("/boardDelete")
	public String deleteAction(HttpServletRequest request, Model model) {
		service.deleteDao(request.getParameter("idx"));
		return "redirect:boardList";
	}

	@RequestMapping("/boardWrite")
	public String showBoardWrite() {
		return "boardWrite";
	}

	@RequestMapping("/boardWriteAction")
	public String writeAction(HttpServletRequest request, BoardDto dto) {
		// �Ű������� dto�� �޾ƹ����� �˾Ƽ� ���� name�� ģ������ dto��ü�� ��ܼ� �Ѿ������.
		service.writeDao(dto);
		return "redirect:boardList";
	}
}