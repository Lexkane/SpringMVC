package com.lexkane.service;

import com.lexkane.dao.UserDAO;
import com.lexkane.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public List<User> getUserList() {
		return userDAO.getUserList();
	}
}
