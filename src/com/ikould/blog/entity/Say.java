package com.ikould.blog.entity;

import org.springframework.stereotype.Component;


/**
 * 说说
 * <p>
 * 
 * @author ikould
 *
 */
@Component
public class Say {
	// id
	private int id;
	// 作者
	private int masterId;
	// 文本
	private String content;
	// 所有留言 以","分割
	private String messageId;
	// 日期
	private long date;
	// 浏览次数
	private int viewTimes;

	public Say() {
		super();
	}

	public Say(int id, int masterId, String content, String messageId,
			long date, int viewTimes) {
		super();
		this.id = id;
		this.masterId = masterId;
		this.content = content;
		this.messageId = messageId;
		this.date = date;
		this.viewTimes = viewTimes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMasterId() {
		return masterId;
	}

	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String String() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
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
		return "Say [id=" + id + ", masterId=" + masterId + ", content="
				+ content + ", messageId=" + messageId + ", date=" + date
				+ ", viewTimes=" + viewTimes + "]";
	}
}
