package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Web;

@Repository
public interface WebDao {
	/**
	 * 增
	 * 
	 * @param web
	 */
	public void addWeb(Web web);

	/**
	 * 删
	 * 
	 * @param id
	 */
	public void deleteWeb(int id);

	/**
	 * 改
	 * 
	 * @param web
	 */
	public void alterWeb(Web web);

	/**
	 * 通过id获取web
	 * 
	 * @param id
	 * @return
	 */
	public Web getWebById(int id);
}
