package com.stand.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stand.spring.Mapper.RoleMapper;
import com.stand.spring.model.Role;
import com.stand.spring.service.RoleService;


/**
 * 角色业务层
 * @author yangjian
 * 上午11:15:19
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleMapper roleMapper;
	
	/*
	 * 
	 * @see com.acrel.springmvc.service.RoleService#selectRolesByUserId(java.lang.Integer)
	 */
	@Override
	public List<Role> selectRolesByUserId(Integer  userId) {
		// TODO Auto-generated method stub
		
		return (List<Role>) roleMapper.selectByPrimaryKey(userId);
	}


}
