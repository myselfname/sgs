package com.shsxt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.shsxt.po.Account;
import com.shsxt.service.impl.AccountServiceImpl;

@Controller
public class AccountController {
	@Resource
	private AccountServiceImpl accountServiceImpl;
	
	@RequestMapping("queryAccountById")
	@ResponseBody
	public Account queryAccountById(int id){
		return accountServiceImpl.queryAccountById(id);
	}
	
	

}
