package com.starjobs.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * @author taojian
 * @time  2017年5月8日下午7:59:56
 * @ClassName LoginIntercetor.java
 * @description 设置拦截器
 */
public class LoginIntercetor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//获取请求的url
		
		String url=request.getRequestURI();
		//如果是登录页面则放行
				if(url.indexOf("login")>=0){
					return true;
				}
				HttpSession session = request.getSession();
				//从session中取出用户身份信息
				String username = (String) session.getAttribute("cAdminName");
				
				if(username != null){
					//身份存在，放行
					return true;
				}
				//用户没有登录挑战到登录页面
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				
				return false;
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
