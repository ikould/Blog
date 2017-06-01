package com.ikould.blog.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ikould.blog.service.AdminService;
import com.ikould.blog.utils.DownloadFileUtil;

/**
 * �ļ�����
 * 
 * @author ikould
 */
@Controller
public class DownloadController {
	@Autowired
	AdminService adminService;

	@RequestMapping(value = "download")
	public void main(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		DownloadFileUtil.downloadFile(request, response);
	}
}
