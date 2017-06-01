package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Article;

@Repository
public interface ArticleDao {

	/**
	 * Ôö
	 * 
	 * @param article
	 */
	public void addArticle(Article article);

	/**
	 * É¾
	 * 
	 * @param id
	 */
	public void deleteArticle(int id);

	/**
	 * ¸Ä
	 * 
	 * @param article
	 */
	public void alterArticle(Article article);
	
	/**
	 * ²é
	 * 
	 * @param id
	 * @return
	 */
	public Article getArticleById(int id);
	
}
