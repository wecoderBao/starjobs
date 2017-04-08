/**
 * 
 */
package com.starjobs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>Title:SignIn</p>
 * <p>Description:</p>
 * @author:bao
 */
@Controller
public class SignInController {
	
	@RequestMapping(value="/user/register/sign_in",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> verifyCode(){
		Map<String,Object> modelMap = new HashMap<String,Object>(3);
		modelMap.put("error_code", "200");
		modelMap.put("message", "success");
		return modelMap;
	}
}
