package com.shsxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.shsxt.po.User;
import com.shsxt.service.impl.UserServiceImpl;


@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	
	@RequestMapping("queryUserById")
	public ModelAndView queryUserById(Integer id){
		ModelAndView mv=new ModelAndView();		
		mv.setViewName("hello");		
		User user= userService.queryUserById(id);
		mv.addObject("user", user);	
		return mv;	
	}

}
