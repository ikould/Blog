package com.ikould.blog.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ikould.blog.service.ArticleCategroyService;
import com.ikould.blog.service.ArticleService;
import com.ikould.blog.service.MasterService;
import com.ikould.blog.service.MessageService;
import com.ikould.blog.service.SayService;
import com.ikould.blog.service.UserService;
import com.ikould.blog.service.WebService;

/**
 * 博客首页
 * 
 * @author ikould
 */
@Controller
public class IndexController {

	@Autowired
	ArticleCategroyService articleCategroyService;
	@Autowired
	ArticleService articleService;
	@Autowired
	MasterService masterService;
	@Autowired
	MessageService messageService;
	@Autowired
	SayService sayService;
	@Autowired
	UserService userService;
	@Autowired
	WebService webService;

	@RequestMapping(value = "index")
	public void main(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		// 设置编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println(" ==========================  ");
		System.out.println(response.toString());
		System.out.println(" ==========================  ");
		// 获得从客户端传入的userName
		String questType = request.getParameter("type");
		switch (questType) {
		}
	}
}
