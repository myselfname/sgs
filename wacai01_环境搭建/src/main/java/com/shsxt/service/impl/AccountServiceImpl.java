package com.shsxt.service.impl;

import java.util.List;






import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shsxt.po.Account;
import com.shsxt.service.BaseService;


@Service
public class AccountServiceImpl extends BaseService<Account>{


/*	@Resource
	private RedisTemplate  redisTemplate;*/

	public Account queryAccountById(int id){
		Account account=null;
		
		/**
		 * 1.先从缓存服务器取值  如果 值存在  直接 返回
		 * 2.值不存在  查询数据库
		 */
		//account=redisTemplate.get("queryAccountById:id:"+id);
		
	


			account=queryById(id);

		//redisTemplate.set.add("queryAccountById:id:"+id,account);///"queryAccountById:id:"+id

		return  account;
	}


	/*public List<Account> queryForPage(int pageNum,int pageSize){

		return queryForPage(pageNum, pageSize);

	}*/

	public int insert(Account account){
		return super.insert(account);
	}







}
