package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.ArticleCategroy;

@Repository
public interface ArticleCategroyDao {

	/**
	 * Ôö
	 * 
	 * @param articleCategroy
	 */
	public void addArticleCategroy(ArticleCategroy articleCategroy);

	/**
	 * É¾
	 * 
	 * @param id
	 */
	public void deleteArticleCategroy(int id);

	/**
	 * ¸Ä
	 * 
	 * @param articleCategroy
	 */
	public void alterArticleCategroy(ArticleCategroy articleCategroy);
	
	/**
	 * ²é
	 * 
	 * @param id
	 * @return
	 */
	public ArticleCategroy getArticleCategroyById(int id);
}
