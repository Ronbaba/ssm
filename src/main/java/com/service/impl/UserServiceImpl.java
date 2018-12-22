package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public User getUserById(String userid) {
		User user = userDao.getUserById(userid);
		return user;
	}

}
