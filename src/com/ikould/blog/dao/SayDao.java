package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Say;

@Repository
public interface SayDao {
	/**
	 * 增
	 * 
	 * @param say
	 */
	public void addSay(Say say);

	/**
	 * 删
	 * 
	 * @param id
	 */
	public void deleteSay(int id);

	/**
	 * 改
	 * 
	 * @param say
	 */
	public void alterSay(Say say);
	
	/**
	 * 通过id获取say
	 * 
	 * @param id
	 * @return
	 */
	public Say getSayById(int id);
}
