package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.ArticleCategroy;

@Repository
public interface ArticleCategroyDao {

	/**
	 * ��
	 * 
	 * @param articleCategroy
	 */
	public void addArticleCategroy(ArticleCategroy articleCategroy);

	/**
	 * ɾ
	 * 
	 * @param id
	 */
	public void deleteArticleCategroy(int id);

	/**
	 * ��
	 * 
	 * @param articleCategroy
	 */
	public void alterArticleCategroy(ArticleCategroy articleCategroy);
	
	/**
	 * ��
	 * 
	 * @param id
	 * @return
	 */
	public ArticleCategroy getArticleCategroyById(int id);
}
