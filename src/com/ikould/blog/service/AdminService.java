package com.ikould.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikould.blog.dao.AdminDao;
import com.ikould.blog.entity.Admin;

@Service
public class AdminService {
	@Autowired
	AdminDao adminDao;

	public void addAdmin(String name, String password) {
		Admin admin = new Admin();
		admin.setName(name);
		admin.setPassword(password);
		adminDao.addAdmin(admin);
	}

	/**
	 * 检测admin的用户名是否可用
	 * 
	 * @param adminName
	 * @return
	 */
	public Admin getAdminByName(String adminName) {
		return adminDao.checkAdmin(adminName);
	}
}
