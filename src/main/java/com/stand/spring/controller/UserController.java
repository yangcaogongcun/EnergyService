package com.stand.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.stand.spring.model.Users;
import com.stand.spring.service.UserService;

import net.sf.json.JSONArray;


/**
 * 用户控制器
 * @author yangjian
 * 上午11:13:01
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	private Logger log=LogManager.getLogger(UserController.class);
	@Resource
	private UserService userService;

	/*@Autowired
	private ResetPwdImpl resetPwdImpl;*/

	/**
	 * 用户登录
	 * 
	 * @param user
	 * @param result
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Valid Users user, BindingResult result, Model model, HttpServletRequest request)
			throws IOException {
		try {
			Subject subject = SecurityUtils.getSubject();
			// 已登陆则 跳到首页
			if (subject.isAuthenticated()) {
				return "redirect:/";
			}
			if (result.hasErrors()) {
				log.info("登入参数错误");
				model.addAttribute("error", "参数错误！");
				return "login";
			}
			// 身份验证
			subject.login(new UsernamePasswordToken(user.getuName(), user.getuPwd()));
			// 验证成功在Session中保存用户信息
			final Users authUserInfo = userService.selectByUsername(user.getuName());
			request.getSession().setAttribute("userInfo", authUserInfo);
		} catch (AuthenticationException e) {
			// 身份验证失败
			e.printStackTrace();
			log.error("用户名或密码错误 ！",e);
			model.addAttribute("error", "用户名或密码错误 ！");
			return "login";
		}
		return "redirect:/";
	}

	/**
	 * 用户登出
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("userInfo");
		// 登出操作
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "login";
	}

//	@RequestMapping(value = "/pwdreset", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
//	public String restPwd(@RequestParam("oldpwd") String oldpwd, @RequestParam("newpwd") String newpwd,
//			@RequestParam("username") String username, HttpServletResponse response, Map<String, Object> map,
//			HttpServletRequest request, HttpSession session) throws IOException {
//		JSONArray data = resetPwdImpl.InvalidatePWD(newpwd, oldpwd, username);
//
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter printWriter = response.getWriter();
//		printWriter.print(data.toString());
//		printWriter.flush();
//		printWriter.close();
//		if (data.getJSONObject(0).get("result").equals(1)) {
//			session.removeAttribute("userInfo");
//			// 登出操作
//			Subject subject = SecurityUtils.getSubject();
//			subject.logout();
//			return "login";
//		}
//		return "redirect:/";
//	}
	/**
	 * 基于角色 标识的权限控制案例
	 */
	/*
	 * @RequestMapping(value = "/admin")
	 * 
	 * @ResponseBody
	 * 
	 * @RequiresRoles(value = RoleSign.ADMIN) public String admin() { return
	 * "拥有admin角色,能访问"; }
	 * 
	 *//**
		 * 基于权限标识的权限控制案例
		 *//*
		 * @RequestMapping(value = "/create")
		 * 
		 * @ResponseBody
		 * 
		 * @RequiresPermissions(value = PermissionSign.USER_CREATE) public
		 * String create() { return "拥有user:create权限,能访问"; }
		 */
}
