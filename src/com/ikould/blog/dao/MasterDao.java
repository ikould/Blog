package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Master;

@Repository
public interface MasterDao {

	/**
	 * ��
	 * 
	 * @param master
	 */
	public void addMaster(Master master);

	/**
	 * ɾ
	 * 
	 * @param id
	 */
	public void deleteMaster(int id);

	/**
	 * ��
	 * 
	 * @param master
	 */
	public void alterMaster(Master master);
	
	/**
	 * ͨ��id��ȡMaster
	 * 
	 * @param id
	 * @return
	 */
	public Master getMasterById(int id);
}
