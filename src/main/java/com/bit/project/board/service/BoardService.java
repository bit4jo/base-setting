package com.bit.project.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.project.board.dao.Dao;
import com.bit.project.board.dto.BoardDto;

@Service
public class BoardService implements IBoardService {
	@Autowired
	private Dao dao;
	
	@Override
	public List<BoardDto> listDao() {
		return dao.listDao();
	}
	@Override
	public void writeDao(BoardDto dto) {
		dao.writeDao(dto);
	}
	@Override
	public void deleteDao(String idx) {
		dao.deleteDao(idx);
	}
}
