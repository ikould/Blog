package com.ikould.blog.dao;

import org.springframework.stereotype.Repository;

import com.ikould.blog.entity.Article;

@Repository
public interface ArticleDao {

	/**
	 * ��
	 * 
	 * @param article
	 */
	public void addArticle(Article article);

	/**
	 * ɾ
	 * 
	 * @param id
	 */
	public void deleteArticle(int id);

	/**
	 * ��
	 * 
	 * @param article
	 */
	public void alterArticle(Article article);
	
	/**
	 * ��
	 * 
	 * @param id
	 * @return
	 */
	public Article getArticleById(int id);
	
}
