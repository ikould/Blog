package com.ikould.blog.entity;

import org.springframework.stereotype.Component;


/**
 * ����
 * 
 * @author ikould
 *
 */
@Component
public class Message {
	// id
	private int id;
	// �û�id
	private int userId;
	// ����
	private String content;
	// ��¼��ʱ��
	private long date;
	// ���޵��û�id����","�ָ�
	private String starUserIds;
	// �ظ���˵˵������˵˵����","�ָ�
	private String replyMessageId;
	// �Ƿ��ǲ����������ԣ��ظ���
	private boolean isMaster;
	
	public Message() {
		super();
	}

	public Message(int id, int userId, String content, long date,
			String starUserIds, String replyMessageId, boolean isMaster) {
		super();
		this.id = id;
		this.userId = userId;
		this.content = content;
		this.date = date;
		this.starUserIds = starUserIds;
		this.replyMessageId = replyMessageId;
		this.isMaster = isMaster;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getStarUserIds() {
		return starUserIds;
	}

	public void setStarUserIds(String starUserIds) {
		this.starUserIds = starUserIds;
	}

	public String getReplyMessageId() {
		return replyMessageId;
	}

	public void setReplyMessageId(String replyMessageId) {
		this.replyMessageId = replyMessageId;
	}

	public boolean isMaster() {
		return isMaster;
	}

	public void setMaster(boolean isMaster) {
		this.isMaster = isMaster;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", userId=" + userId + ", content="
				+ content + ", date=" + date + ", starUserIds="
				+ starUserIds + ", replyMessageId="
				+ replyMessageId + ", isMaster=" + isMaster
				+ "]";
	}
}
