package com.ikould.blog.entity;

import org.springframework.stereotype.Component;

/**
 * ������𣨱�ǩ��
 * 
 * @author ikould
 *
 */
@Component
public class ArticleCategroy {
	// id
	private int id;
	// ����
	private String content;
	// ����
	private String introduction;

	public ArticleCategroy() {
		super();
	}

	public ArticleCategroy(int id, String content, String introduction) {
		super();
		this.id = id;
		this.content = content;
		this.introduction = introduction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Override
	public String toString() {
		return "ArticleCategroy [id=" + id + ", content=" + content + ", introduction="
				+ introduction + "]";
	}
}
