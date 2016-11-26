package com.stand.spring.service;

import com.stand.spring.model.Users;

/**
 * 用户业务层
 * @author yangjian
 * 上午11:14:49
 */
public interface UserService {

	/**
	 * 用户的权限验证，通过用户的密码和用户名到数据库中寻找匹配的数据，匹配成功返回用户的信息
	 * 
	 * @param user
	 * @return
	 */
	Users authentication(Users user);

	/**
	 * 根据用户名查询用户的信息
	 * @param username
	 */
	Users selectByUsername(String username);
}
