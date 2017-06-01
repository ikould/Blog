package com.ikould.blog.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ikould.blog.entity.Admin;
import com.ikould.blog.service.AdminService;

/**
 * ����Ա
 * 
 * @author ikould
 */
@Controller
public class AdminController {
	// ���Admin
	public static final String ADD_ADMIN = "ADD_ADMIN";
	// ���Admin
	public static final String CHECK_ADMIN = "CHECK_ADMIN";
	
	@Autowired
	AdminService adminService;

	@RequestMapping(value = "admin")
	public void main(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		// ���ñ���
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// ��ôӿͻ��˴����userName
		String questType = request.getParameter("type");
		switch (questType) {
		case CHECK_ADMIN:
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			int state = checkAdmin(name, password);
			// ����������ͻ���
			JSONObject json = new JSONObject();
			try {
				json.put("code", state);
				json.put("result", "");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printMsgToClient(response, json);
			break;
		}
	}

	/**
	 * ���Admin�˺�����
	 */
	private int checkAdmin(String name, String password) {
		Admin admin = adminService.getAdminByName(name);
		if (admin != null) {
			return password.equals(admin.getPassword()) ? 1 : 2;
		}
		return 0;
	}

	/**
	 * ����Ϣ���͸��ͻ���
	 * 
	 * @param response
	 * @param json
	 * @throws IOException
	 */
	private void printMsgToClient(HttpServletResponse response, JSONObject json)
			throws IOException {
		PrintWriter pw = response.getWriter();
		pw.print(json.toString());
		pw.flush();
		pw.close();
	}
}
