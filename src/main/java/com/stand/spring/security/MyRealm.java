package com.stand.spring.security;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stand.spring.model.Permission;
import com.stand.spring.model.Role;
import com.stand.spring.model.Users;
import com.stand.spring.service.PermissionService;
import com.stand.spring.service.RoleService;
import com.stand.spring.service.UserService;



/**
 * 此类是调用了shiro的安全框架，这个类里有两个方法，一个是登录验证一个是权限验证
 * @author yangjian
 * 上午11:14:01
 */
@Service(value ="myRealm")
public class MyRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private PermissionService permissionService;
	
	 /**
     * 权限检查
     * 通过用户名查看用户的相应权限
     */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		String username=String.valueOf(principals.getPrimaryPrincipal());
		 final Users user = userService.selectByUsername(username);
		 //获取用户的角色
	        final List<Role> roleInfos = roleService.selectRolesByUserId(user.getuId());
	        for (Role role : roleInfos) {
	            // 添加角色
	            System.err.println(role);
	            authorizationInfo.addRole(role.getRolename());

	            //查看权限
	            final List<Permission> permissions = permissionService.selectByPrimaryKey(role.getId());
	            for (Permission permission : permissions) {
	                // 添加权限
	                System.err.println(permission);
	                authorizationInfo.addStringPermission(permission.getPermissionname());
	            }
	        }
	        return authorizationInfo;
	}

	 /**
     * 登录验证
     * 根据用户传进来的用户名和密码来确定用户的信息是否匹配，如果匹配则返回一个权限确认并存入subject的session中
     */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username= String.valueOf(token.getPrincipal());
		String password=new String((char[]) token.getCredentials());
		
		final Users authentication=userService.authentication(new Users(username,password));
		if(authentication==null){
			throw new AuthenticationException("用户名或密码错误.");
		}
	    SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, getName());
	       
		return authenticationInfo;
	}

}
