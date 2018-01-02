package com.starjobs.controller.admin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.starjobs.common.PageUtil;
import com.starjobs.common.Result;

@Controller
public class RefreshController {

	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("export/file")
	public void exportFile(HttpServletRequest request, HttpServletResponse response) {
		String docsPath = request.getSession().getServletContext().getRealPath("docs");
		
		
		String fileName = "refresh"+System.currentTimeMillis()+".xls";
		String filePath = docsPath + File.separator + fileName;
		download(filePath, response);
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
			response.addHeader("Content-Disposition",
					"attachment;filename=" + new String(filename.getBytes(), "ISO-8859-1"));// 设置下载后的文件名
			response.addHeader("Content-Length", "" + file.length());
			OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
			// 设置文件类型vnd.ms-excel对应.xls文件类型
			response.setContentType("application/vnd.ms-excel;charset=gb2312");
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public Result getRefreshList(@RequestParam int page, @RequestParam int limit, HttpServletRequest request,
			HttpServletResponse response) {
		
		/**
		 * 查询数据列表
		 */
		ArrayList<?> bookList = new ArrayList<Object>();
		/**
		 * 查询记录总数
		 */
		int totalCount = 100;
		
		PageUtil pageUtil = new PageUtil(bookList, page, limit, totalCount);
		request.setAttribute("page", pageUtil);
		try {
			request.getRequestDispatcher("/jsp/pagination.jsp?page=" + page).forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
