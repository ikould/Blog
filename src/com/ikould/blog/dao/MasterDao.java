package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Master;

@Repository
public interface MasterDao {

	/**
	 * 增
	 * 
	 * @param master
	 */
	public void addMaster(Master master);

	/**
	 * 删
	 * 
	 * @param id
	 */
	public void deleteMaster(int id);

	/**
	 * 改
	 * 
	 * @param master
	 */
	public void alterMaster(Master master);
	
	/**
	 * 通过id获取Master
	 * 
	 * @param id
	 * @return
	 */
	public Master getMasterById(int id);
}
