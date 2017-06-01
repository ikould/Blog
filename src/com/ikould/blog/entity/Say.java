package com.ikould.blog.entity;

import org.springframework.stereotype.Component;


/**
 * ˵˵
 * <p>
 * 
 * @author ikould
 *
 */
@Component
public class Say {
	// id
	private int id;
	// ����
	private int masterId;
	// �ı�
	private String content;
	// �������� ��","�ָ�
	private String messageId;
	// ����
	private long date;
	// �������
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
