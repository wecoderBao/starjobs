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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.starjobs.common.ExportExcel;
import com.starjobs.common.PageUtil;
import com.starjobs.pojo.CompanyRefresh;

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

		String fileName = "refresh" + System.currentTimeMillis() + ".xls";
		String filePath = docsPath + File.separator + fileName;
		ExportExcel<CompanyRefresh> ex = new ExportExcel<CompanyRefresh>();
		String[] headers = { "区域", "公司名称", "联系电话", "详细地址", "刷新次数", "消费金额" };
		List<CompanyRefresh> dataset = new ArrayList<CompanyRefresh>();
		dataset.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6", "600"));
		dataset.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6", "600"));
		dataset.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6", "600"));
		try  
        {   
            OutputStream out = new FileOutputStream(filePath);   
            ex.exportExcel(headers, dataset, out);  
            out.close();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
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

	/**
	 * 列表数据
	 * @param page
	 * @param limit
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/get/refreshList")
	public void getRefreshList(@RequestParam int page, @RequestParam int limit, HttpServletRequest request,
			HttpServletResponse response) {

		/**
		 * 查询数据列表
		 */
		ArrayList<CompanyRefresh> refreshList = new ArrayList<CompanyRefresh>();
		refreshList.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6", "600"));
		refreshList.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6", "600"));
		refreshList.add(new CompanyRefresh("洪山区", "爱尔眼科医院", "13164618323", "洪山区12号", "6", "600"));
		/**
		 * 查询记录总数
		 */
		int totalCount = 100;

		PageUtil pageUtil = new PageUtil(refreshList, page, limit, totalCount);
		request.setAttribute("page", pageUtil);
		try {
			request.getRequestDispatcher("/WEB-INF/jsp/pagination.jsp?page=" + page).forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
