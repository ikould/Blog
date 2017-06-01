package com.ikould.blog.entity;

import org.springframework.stereotype.Component;

/**
 * BannerͼƬ
 * 
 * @author ikould
 *
 */
@Component
public class Banner {
	
	// id
	private int id;
	// ͼƬ��ַ
	private String imgPath;
	// ����
	private long date;
	// ����
	private int sequence;

	public Banner() {
	}

	public Banner(int id, String imgPath, long date, int sequence) {
		super();
		this.id = id;
		this.imgPath = imgPath;
		this.date = date;
		this.sequence = sequence;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequencer(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		return "Banner [id=" + id + ", imgPath=" + imgPath + ", date=" + date
				+ ", sequence=" + sequence + "]";
	}
}
