package com.stand.spring.service;

import java.util.List;

import com.stand.spring.model.Permission;



/**
 * 用户权限的接口
 * @author yangjian
 * 上午11:14:29
 */

public interface PermissionService {

	/**
	 * 查出当前用户下的所有权限
	 * @param id
	 * @return
	 */
	List<Permission> selectByPrimaryKey(Integer id);
}
