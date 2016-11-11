package com.shsxt.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.shsxt.po.User;
import com.shsxt.service.impl.UserServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestUserService {
	
	@Resource
	private UserServiceImpl userService;

	@Test
	public void test01() {
		User user= userService.queryUserById(17);
		
		System.err.println(user);
	}
	
	
	@Test
	public void test02() {
		PageInfo<User> pageInfo= userService.queryUsers(2, 2);	
		
		System.err.println("总页数："+pageInfo.getPages()+"总记录数:"+pageInfo.getTotal());
		/*for(User user:pageInfo.getList()){
			System.err.println(user);
		}*/
		
	}

	
	
	
	
}
