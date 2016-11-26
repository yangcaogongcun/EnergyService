package com.stand.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stand.spring.Mapper.PermissionMapper;
import com.stand.spring.model.Permission;
import com.stand.spring.service.PermissionService;


/**
 * 权限业务层
 * @author yangjian
 * 上午11:15:04
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

	@Resource
	private PermissionMapper permissionMapper;
	
	/*
	 * 
	 * @see com.acrel.springmvc.service.PermissionService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public List<Permission> selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		
		return (List<Permission>) permissionMapper.selectByPrimaryKey(id);
	}

}
