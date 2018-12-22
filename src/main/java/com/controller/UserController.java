package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView getIndex() {
		ModelAndView mv = new ModelAndView("index");
		User user = userService.getUserById("0002");
		mv.addObject("user", user);
		return mv;
	}

}
