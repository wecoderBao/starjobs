package com.starjobs.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.starjobs.pojo.TAdmin;
import com.starjobs.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminservice;
	
	
	
	
	//简单跳转个人设置
	//注册新账号
	@RequestMapping("signUpAdmin")
	public String signUpAdmin(){
		return "jsp/signUp";
	}
	
	/**
	 * 根据用户名来显示到修改个人信息页面上
	 */
	@RequestMapping("editInfoAdmin")
	public ModelAndView editInfoAdmin(HttpServletRequest request){
		HttpSession session = request.getSession();
		//从session中取出用户身份信息
		String username = (String) session.getAttribute("cAdminName");
	
		TAdmin tadmin=adminservice.findUserByName(username);
		ModelAndView mv=new ModelAndView();
		mv.addObject("tadmin", tadmin);
		mv.setViewName("jsp/editInfo");
		return mv;
	}
	
	/**
	 * @author taojian
	 * @time 2017年5月8日下午9:50:17
	 * @methodname editAdmin
	 * @descripe 修改个人信息
	 */
	@RequestMapping("editAdmin")
	public ModelAndView editAdmin(TAdmin record,HttpServletRequest request){
	
		HttpSession session = request.getSession();
		//从session中取出用户身份信息
		String username = (String) session.getAttribute("cAdminName");
	
		TAdmin tadmin=adminservice.findUserByName(username);
		record.setcAdminId(tadmin.getcAdminId());
		int a=adminservice.updateByPrimaryKey(record);
		TAdmin tadminupadte=adminservice.findUserByName(username);
		ModelAndView mv=new ModelAndView();
		mv.addObject("tadmin", tadminupadte);
		mv.setViewName("jsp/editInfo");
		return mv;
	}
	
	
	//修改信息管理的用户信息管理跳转
		@RequestMapping("editUsers")
		public String editUsers(){
			return "jsp/users";
		}
		
		//修改信息管理的公司信息管理跳转
		@RequestMapping("editCompanys")
		public String editCompanys(){
			return "jsp/company";
		}

		/**
		 * @author taojian
		 * @time 2017年5月8日下午9:11:47
		 * @methodname AdminController.java
		 * @descripe 修改信息管理的管理員信息管理跳转,查询信息返回给页面上
		 */
		@RequestMapping("editManager")
		public ModelAndView  editManager(){
			List<TAdmin> list=adminservice.selectAllAdmin();
			ModelAndView mv=new ModelAndView();
			mv.addObject("list",list);
			mv.setViewName("jsp/manager");			
		    return mv;
		}
		

		
		
		
}