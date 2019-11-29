package com.jw.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jw.pojo.User;
import com.jw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login")
    public String login(String userName, String password,HttpServletRequest request) {
		User user=userService.doLogin(userName, password);
		if(user==null){ 
			request.setAttribute("error", "用户名或密码错误");
			return "error";
		}
		return "welcome";
	}
	
	@RequestMapping(value="/register")
	@ResponseBody
    public String  register(String userName, String password,HttpServletRequest request) {
		userService.doRegister(userName, password);
		return "200";
	}
	
	@RequestMapping(value="/validateAccount")
	@ResponseBody
    public int validateAccount(String userName) {
		return userService.doValidateAccount(userName);
	}
	
	/*@RequestMapping(value="/getAllUser1")
	@ResponseBody
    public List<User> getAllUser1(
    		@RequestParam(required = false, defaultValue = "1") Integer startPage,
    		@RequestParam(required = false, defaultValue = "100") Integer PageSize) {
		PageHelper.startPage(startPage, PageSize);
		List<User> users = new ArrayList<>();
        users = userService.findAllUser();
        PageInfo<User> pi = new PageInfo<>(users);
        return users;

	}*/
	
	@RequestMapping(value="/getUserList")
	@ResponseBody
    public List<User> getUserList() {
		return userService.getUserList();
	}
	
	
		
}
