package com.ikould.blog.entity;

import org.springframework.stereotype.Component;

/**
 * ��վʵ����
 * <p>
 * ��¼��վ��������
 * 
 * @author ikould
 */
@Component
public class Web {
	// id
	private int id;
	// ��վ����
	private String name;
	// �������
	private int viewTimes;
	// �������ip��ַ����","�ָ�
	private String ipAddress;
	// ѡ��Ĳ�����
	private int masterId;
	// Banner ����Id
	private String bannerIds;

	public Web() {
		super();
	}
	
	public Web(int id, String name, int viewTimes, String ipAddress,
			int masterId, String bannerIds) {
		super();
		this.id = id;
		this.name = name;
		this.viewTimes = viewTimes;
		this.ipAddress = ipAddress;
		this.masterId = masterId;
		this.bannerIds = bannerIds;
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

	public int getViewTimes() {
		return viewTimes;
	}

	public void setViewTimes(int viewTimes) {
		this.viewTimes = viewTimes;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getMasterId() {
		return masterId;
	}

	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}

	public String getBannerIds() {
		return bannerIds;
	}

	public void setBannerIds(String bannerIds) {
		this.bannerIds = bannerIds;
	}

	@Override
	public String toString() {
		return "Web [id=" + id + ", name=" + name + ", viewTimes=" + viewTimes
				+ ", ipAddress=" + ipAddress + ", masterId=" + masterId
				+ ", bannerIds=" + bannerIds + "]";
	}
}
