package com.starjobs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	//简单跳转个人设置
	//注册新账号
	@RequestMapping("signUpAdmin")
	public String signUpAdmin(){
		return "jsp/signUp";
	}
	
	//修改个人信息
	@RequestMapping("editInfoAdmin")
	public String editInfoAdmin(){
		return "jsp/editInfo";
	}
	//修改信息管理的用户信息管理跳转
		@RequestMapping("editUsers")
		public String editUsers(){
			return "jsp/users";
		}
		
}
