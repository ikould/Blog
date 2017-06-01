package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Say;

@Repository
public interface SayDao {
	/**
	 * ��
	 * 
	 * @param say
	 */
	public void addSay(Say say);

	/**
	 * ɾ
	 * 
	 * @param id
	 */
	public void deleteSay(int id);

	/**
	 * ��
	 * 
	 * @param say
	 */
	public void alterSay(Say say);
	
	/**
	 * ͨ��id��ȡsay
	 * 
	 * @param id
	 * @return
	 */
	public Say getSayById(int id);
}
