package com.bit.project.board.service;

import java.util.List;

import com.bit.project.board.dto.BoardDto;

public interface IBoardService {
	public List<BoardDto> listDao();
	public void writeDao(BoardDto dto);
	public void deleteDao(String idx);
}
