package com.shsxt.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.shsxt.dao.UserMapper;
import com.shsxt.po.User;
import com.shsxt.query.BaseQuery;
import com.shsxt.service.BaseService;

@Service
public class UserServiceImpl extends BaseService<User> {
	
	public User queryUserById(int id) {
		return queryById(id);
	}


	public PageInfo<User> queryUsers(int pageNum, int pageSize) {
		BaseQuery baseQuery=new BaseQuery();
		baseQuery.setPageNum(pageNum);
		baseQuery.setPageSize(pageSize);
		return queryForPage(baseQuery);
	}

}
