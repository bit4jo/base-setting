package com.bit.project.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.project.board.dto.BoardDto;

@Repository
public class Dao {
	@Autowired
	private SqlSession sqlSession;
	// ��ģ���� IDao.xml�� �����ص� namespace�̴�.
	private static final String NAME_SPACE = "board.dao.IDao";
	
	public List<BoardDto> listDao() {
		return sqlSession.selectList(NAME_SPACE+".listDao");
	}
	public void writeDao(BoardDto dto) {
		sqlSession.insert(NAME_SPACE+".writeDao", dto);
	}
	public void deleteDao(String idx) {
		sqlSession.delete(NAME_SPACE+".deleteDao", idx);
	}
}
