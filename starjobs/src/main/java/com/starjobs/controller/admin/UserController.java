package com.starjobs.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starjobs.service.AdminService;

@Controller
public class UserController {

	@Autowired
	AdminService adminService;
	@RequestMapping("/login")
	public String loginAdmin(String cAdminName,String cAdminPassword){
		if(adminService.loginAdmin(cAdminName, cAdminPassword))
		return "jsp/index";
		else 
			return "jsp/error";
	}
}
