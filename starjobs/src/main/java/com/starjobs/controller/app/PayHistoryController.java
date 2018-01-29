package com.starjobs.controller.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.starjobs.dto.RefreshJobDto;
import com.starjobs.service.PayHistoryService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * 充值、提现、消费相关历史记录
 * 
 * @author sunbao
 *
 */
@Controller
public class PayHistoryController {
	@Autowired
	private PayHistoryService payHistoryService;
	@Autowired
	private TokenService tokenService;

	@RequestMapping(value = "")
	public Map<String, Object> getRefreshListByUserId(@RequestParam Integer userId, HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || !SystemUtil.USER_COM.equals(userFlag)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		List<RefreshJobDto> dtoList = payHistoryService.getRefreshListByUserId(userId);
		Map<String,Object> resultMap = new HashMap<String,Object>(4);
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		resultMap.put("recordList", dtoList);
		modelMap.put("data", resultMap);
		return modelMap;
	}

}
