package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.User;

@Repository
public interface UserDao {
	/**
	 * ��
	 * 
	 * @param user
	 */
	public void addUser(User user);

	/**
	 * ɾ
	 * 
	 * @param id
	 */
	public void deleteUser(int id);

	/**
	 * ��
	 * 
	 * @param user
	 */
	public void alterUser(User user);

	/**
	 * ͨ��id��ȡsay
	 * 
	 * @param id
	 * @return
	 */
	public User getUserById(int id);
}
