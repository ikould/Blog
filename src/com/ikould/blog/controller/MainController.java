package com.ikould.blog.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ikould.blog.service.AdminService;

@Controller
public class MainController {

	@Autowired
	AdminService adminService;

	@RequestMapping(value = "main")
	public void main(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		// ���ñ���
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println(" ==========================  ");
		System.out.println(response.toString());
		System.out.println(" ==========================  ");
		// ��ôӿͻ��˴����userName
		String questType = request.getParameter("type");
		switch (questType) {
		}
	}
}
