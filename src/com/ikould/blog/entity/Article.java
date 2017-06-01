package com.ikould.blog.entity;

import org.springframework.stereotype.Component;


/**
 * ��������
 * <p>
 * 
 * @author ikould
 *
 */
@Component
public class Article {
	// id
	private int id;
	// ��Ŀ
	private String title;
	// �������","�ָ�
	private String categroyIds;
	// ����
	private int masterId;
	// ������
	private String subTitle;
	// �ı�
	private String content;
	// �������ԣ�����","�ָ�
	private String messageIds;
	// ����
	private long date;
	// �������
	private int viewTimes;

	public Article() {
		super();
	}

	public Article(int id, String title, String categroyIds,int masterId,
			String subTitle, String content, String messageIds, long date,
			int viewTimes) {
		super();
		this.id = id;
		this.title = title;
		this.categroyIds = categroyIds;
		this.masterId = masterId;
		this.subTitle = subTitle;
		this.content = content;
		this.messageIds = messageIds;
		this.date = date;
		this.viewTimes = viewTimes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategroyIds() {
		return categroyIds;
	}

	public void setCategroyIds(String categroyIds) {
		this.categroyIds = categroyIds;
	}

	public int getMasterId() {
		return masterId;
	}

	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public String getMessageIds() {
		return messageIds;
	}

	public void setMessageIds(String messageIds) {
		this.messageIds = messageIds;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public int getViewTimes() {
		return viewTimes;
	}

	public void setViewTimes(int viewTimes) {
		this.viewTimes = viewTimes;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", categroyIds="
				+ categroyIds + ", masterId=" + masterId + ", subTitle="
				+ subTitle + ", content=" + content + ", messageIds="
				+ messageIds + ", date=" + date + ", viewTimes=" + viewTimes
				+ "]";
	}
}
