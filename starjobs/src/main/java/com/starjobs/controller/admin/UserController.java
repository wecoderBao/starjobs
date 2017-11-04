package com.starjobs.controller.admin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.starjobs.common.ExportExcel;
import com.starjobs.pojo.CompanyRefresh;
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
	//导出公司发布兼职信息
	@RequestMapping(value="/export2File",method=RequestMethod.GET)
	public void exportFile(HttpServletRequest request,
			HttpServletResponse response){
		ExportExcel<CompanyRefresh> ex = new ExportExcel<CompanyRefresh>();  
        String[] headers =  
        { "区域", "公司名称", "联系电话", "详细地址", "刷新次数","消费金额" };  
        List<CompanyRefresh> dataset = new ArrayList<CompanyRefresh>();  
        dataset.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6","600"));  
        dataset.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6","600"));  
        dataset.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6","600"));  
        File file =null;
        try  
        {   
        	String realPath = request.getSession().getServletContext().getRealPath("/excel");
        	String filePath = realPath+File.separator+""+System.currentTimeMillis()+".xls";
        	file = new File(filePath);
            OutputStream out = new FileOutputStream(file);   
            ex.exportExcel(headers, dataset, out);  
            out.close();  
            System.out.println("excel导出成功！");  
            download(filePath,response);
            if(file.exists()){
            	file.delete();
            }
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        
	}
	private void download(String path, HttpServletResponse response) {
		try {
			// path是指欲下载的文件的路径。
			File file = new File(path);
			// 取得文件名。
			String filename = file.getName();
			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// 清空response
			response.reset();
			// 设置response的Header
			response.addHeader("Content-Disposition", "attachment;filename="
					+ new String(filename.getBytes(),"ISO-8859-1"));//设置下载后的文件名
			response.addHeader("Content-Length", "" + file.length());
			OutputStream toClient = new BufferedOutputStream(
					response.getOutputStream());
			//设置文件类型vnd.ms-excel对应.xls文件类型
			response.setContentType("application/vnd.ms-excel;charset=gb2312");
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
