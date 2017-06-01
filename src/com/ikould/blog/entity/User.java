package com.ikould.blog.entity;

import org.springframework.stereotype.Component;


/**
 * �ο�
 * <p>
 * 
 * @author ikould
 */
@Component
public class User {
	// id
	private int id;
	// ����
	private String name;
	// ����
	private String email;
	// ���ԣ���","�ָ�
	private String messageIds;
	// �������½��ip��ַ
	private String ipAddress;

	public User() {
		super();
	}

	public User(int id, String name, String email, String messageIds,
			String ipAddress) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.messageIds = messageIds;
		this.ipAddress = ipAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessageIds() {
		return messageIds;
	}

	public void setMessageIds(String messageIds) {
		this.messageIds = messageIds;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email
				+ ", messageIds=" + messageIds + ", ipAddress=" + ipAddress
				+ "]";
	}
}
