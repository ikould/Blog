package com.ikould.blog.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ikould.blog.service.AdminService;
import com.ikould.blog.utils.UploadFileUtil;

/**
 * ÉÏ´«
 * 
 * @author ikould
 */
@Controller
public class UploadController {
	@Autowired
	AdminService adminService;

	@RequestMapping(value = "upload")
	public void main(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		UploadFileUtil.uploadFile(request, response, "");
	}
}
