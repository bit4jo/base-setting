package com.bit.project.signInOut.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.project.signInOut.dto.Users;

@Repository
public class SignInOutDAO {

	@Autowired
	private SqlSession sql;
	
	private final String NAMESPACE = "com.bit.project.users";
	
	public List<Users> listAll(){
		return sql.selectList(NAMESPACE+".listAll");
	}
	
}
