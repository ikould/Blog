package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.User;

@Repository
public interface UserDao {
	/**
	 * 增
	 * 
	 * @param user
	 */
	public void addUser(User user);

	/**
	 * 删
	 * 
	 * @param id
	 */
	public void deleteUser(int id);

	/**
	 * 改
	 * 
	 * @param user
	 */
	public void alterUser(User user);

	/**
	 * 通过id获取say
	 * 
	 * @param id
	 * @return
	 */
	public User getUserById(int id);
}
