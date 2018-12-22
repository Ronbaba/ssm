package com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UserDao;
import com.service.UserService;

public class UserdaoTest extends SpringTestCase{
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserDao userDao;
	
	@Test
	public void testgetUserById() {
		System.out.println(userService.getUserById("0002"));
	}

}
