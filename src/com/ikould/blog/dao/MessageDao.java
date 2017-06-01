package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Master;
import com.ikould.blog.entity.Message;

@Repository
public interface MessageDao {
	/**
	 * ��
	 * 
	 * @param message
	 */
	public void addMessage(Message message);

	/**
	 * ɾ
	 * 
	 * @param id
	 */
	public void deleteMessage(int id);

	/**
	 * ��
	 * 
	 * @param message
	 */
	public void alterMessage(Message message);
	
	/**
	 * ͨ��id��ȡmessage
	 * 
	 * @param id
	 * @return
	 */
	public Master getMessageById(int id);
}
