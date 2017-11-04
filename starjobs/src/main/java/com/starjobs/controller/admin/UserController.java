package com.starjobs.controller.admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.starjobs.service.AdminService;

@Controller
public class UserController {

	@Autowired
	AdminService adminService;
	/**
	 * @author taojian
	 * @time 2017年5月8日下午8:16:15
	 * @methodname loginAdmin
	 * @descripe 增加拦截器，增加session
	 */
	@RequestMapping("/login")
	public String loginAdmin(HttpSession session,String cAdminName,String cAdminPassword){
		if(adminService.loginAdmin(cAdminName, cAdminPassword))
		{
			//在Session中保存用户信息
			session.setAttribute("cAdminName", cAdminName);
			return "jsp/index";
		}	
		else 
			return "jsp/error";
	}
	
	/**
	 * @descripe 用户退出功能，清除Session，跳转页面
	 */
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)  {

		// 清除session
		session.invalidate();		
		return "redirect:/login.jsp";
	}
	//查看公司发布兼职信息
	@RequestMapping(value="/companyPublishJob",method=RequestMethod.GET)
	public  String companyPublishJob(){
		return "jsp/companyPublishJob";
	}
}
