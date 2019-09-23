package com.bit.project.signInOut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.project.signInOut.dao.SignInOutDAO;
import com.bit.project.signInOut.dto.Users;

@Service
public class SignInOutService_imp implements SignInOutService {
	
	@Autowired
	private SignInOutDAO dao;

	@Override
	public List<Users> listAll() {
		return dao.listAll();
	}

}
