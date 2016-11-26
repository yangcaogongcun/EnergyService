package com.stand.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stand.spring.Mapper.UsersMapper;
import com.stand.spring.model.Users;
import com.stand.spring.service.UserService;

/**
 * 用户业务层
 * @author yangjian
 * 上午11:15:30
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UsersMapper userMapper;
	
	/*
	 * 
	 * @see com.acrel.springmvc.service.UserService#authentication(com.acrel.springmvc.model.User)
	 */
	@Override
	public Users authentication(Users user) {
		
		return userMapper.selectOne(user);
	}

	/*
	 * 
	 * @see com.acrel.springmvc.service.UserService#selectByUsername(java.lang.String)
	 */
	@Override
	public Users selectByUsername(String username) {
		Users users=new Users();
		users.setuName(username);
		return userMapper.selectOne(users);
	}

	

}
