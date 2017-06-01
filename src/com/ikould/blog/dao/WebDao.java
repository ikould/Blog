package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Web;

@Repository
public interface WebDao {
	/**
	 * ��
	 * 
	 * @param web
	 */
	public void addWeb(Web web);

	/**
	 * ɾ
	 * 
	 * @param id
	 */
	public void deleteWeb(int id);

	/**
	 * ��
	 * 
	 * @param web
	 */
	public void alterWeb(Web web);

	/**
	 * ͨ��id��ȡweb
	 * 
	 * @param id
	 * @return
	 */
	public Web getWebById(int id);
}
