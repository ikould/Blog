package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Admin;

@Repository
public interface AdminDao {

	/**
	 * ��
	 * 
	 * @param admin
	 */
	public void addAdmin(Admin admin);

	/**
	 * ɾ 
	 * 
	 * @param admin
	 */
	public void deleteAdmin(int id);

	/**
	 * ��
	 * 
	 * @param admin
	 */
	public void alterAdmin(Admin admin);

	/**
	 * ��
	 * 
	 * @return
	 */
	public Admin checkAdmin(String name);

}
