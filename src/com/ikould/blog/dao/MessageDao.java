package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Master;
import com.ikould.blog.entity.Message;

@Repository
public interface MessageDao {
	/**
	 * 增
	 * 
	 * @param message
	 */
	public void addMessage(Message message);

	/**
	 * 删
	 * 
	 * @param id
	 */
	public void deleteMessage(int id);

	/**
	 * 改
	 * 
	 * @param message
	 */
	public void alterMessage(Message message);
	
	/**
	 * 通过id获取message
	 * 
	 * @param id
	 * @return
	 */
	public Master getMessageById(int id);
}
