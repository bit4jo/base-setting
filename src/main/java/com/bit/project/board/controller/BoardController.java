package com.bit.project.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
//	@Autowired
//	private IBoardService service;
	
	@RequestMapping("/")
	public String root() {
//		model.addAttribute("list", service.listDao());
		System.out.println("/걸림");
		return "index";
	}

	@RequestMapping("/boardIndex")
	public String showBoardList() {
		System.out.println("게시판 인덱스로");
		return "board/boardIndex";
	}

//	@RequestMapping("/boardDelete")
//	public String deleteAction(HttpServletRequest request, Model model) {
//		service.deleteDao(request.getParameter("idx"));
//		return "redirect:boardList";
//	}
//
//	@RequestMapping("/boardWrite")
//	public String showBoardWrite() {
//		return "boardWrite";
//	}
//
//	@RequestMapping("/boardWriteAction")
//	public String writeAction(HttpServletRequest request, BoardDto dto) {
//		// �Ű������� dto�� �޾ƹ����� �˾Ƽ� ���� name�� ģ������ dto��ü�� ��ܼ� �Ѿ������.
//		service.writeDao(dto);
//		return "redirect:boardList";
//	}
}