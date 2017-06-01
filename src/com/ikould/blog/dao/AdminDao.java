package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Admin;

@Repository
public interface AdminDao {

	/**
	 * Ôö
	 * 
	 * @param admin
	 */
	public void addAdmin(Admin admin);

	/**
	 * É¾ 
	 * 
	 * @param admin
	 */
	public void deleteAdmin(int id);

	/**
	 * ¸Ä
	 * 
	 * @param admin
	 */
	public void alterAdmin(Admin admin);

	/**
	 * ²é
	 * 
	 * @return
	 */
	public Admin checkAdmin(String name);

}
