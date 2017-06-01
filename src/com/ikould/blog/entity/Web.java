package com.ikould.blog.entity;

import org.springframework.stereotype.Component;

/**
 * 网站实体类
 * <p>
 * 记录网站访问数据
 * 
 * @author ikould
 */
@Component
public class Web {
	// id
	private int id;
	// 网站名字
	private String name;
	// 浏览次数
	private int viewTimes;
	// 浏览过的ip地址，以","分割
	private String ipAddress;
	// 选择的博客主
	private int masterId;
	// Banner 所有Id
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
