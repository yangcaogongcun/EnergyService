package com.stand.spring.service;

import java.util.List;

import com.stand.spring.model.Role;



/**
 * 角色业务层
 * @author yangjian
 * 上午11:14:38
 */
 
public interface RoleService {

	/**
	 * 根据当前用户查询出当前用户的角色类型
	 * @param userId
	 * @return
	 */
	 List<Role> selectRolesByUserId(Integer userId);
}
