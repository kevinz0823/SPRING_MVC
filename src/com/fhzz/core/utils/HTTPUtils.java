/**
 * 
 */
package com.fhzz.core.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author YangYi
 * 
 */
public class HTTPUtils {
	/**
	 * 从request获取登录的IP,别问,网上抄的,反正很好用
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddress(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	// 判断是否为ajax请求
	public static boolean isAjaxRequest(HttpServletRequest request) {
		if (request.getHeader("accept").indexOf("application/json") > -1
				|| (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").equals(
						"XMLHttpRequest"))) {
			return true;
		}
		return false;
	}

}
