package com.ikould.blog.entity;

import org.springframework.stereotype.Component;


/**
 * 博客主
 * <p>
 * 登陆博客网站的用户
 * 
 * @author ikould
 *
 */
@Component
public class Master {
	// 数据表id
	private int id;
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 性别
	private int sex;
	// 个人简介
	private String introduce;
	// 文章id数组，以","分割
	private String articleIds;
	// 最近文章id
	private int latelyArticleId;
	// 最近说说id
	private int latelySayId;
	// 说说id数组，以","分割
	private String sayIds;
	// 新浪地址
	private String linkSina;
	// QQ地址
	private String linkQQ;
	// 微博地址
	private String linkWeiBo;
	// Github地址
	private String linkGithub;
	// 邮箱
	private String email;

	public Master() {
		super();
	}

	public Master(int id, String name, int age, int sex, String introduce,
			String articleIds, int latelyArticleId, int latelySayId,
			String sayIds, String linkSina, String linkQQ, String linkWeiBo,
			String linkGithub, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.introduce = introduce;
		this.articleIds = articleIds;
		this.latelyArticleId = latelyArticleId;
		this.latelySayId = latelySayId;
		this.sayIds = sayIds;
		this.linkSina = linkSina;
		this.linkQQ = linkQQ;
		this.linkWeiBo = linkWeiBo;
		this.linkGithub = linkGithub;
		this.email = email;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}


	public int getLatelyArticleId() {
		return latelyArticleId;
	}

	public void setLatelyArticleId(int latelyArticleId) {
		this.latelyArticleId = latelyArticleId;
	}

	public int getLatelySayId() {
		return latelySayId;
	}

	public void setLatelySayId(int latelySayId) {
		this.latelySayId = latelySayId;
	}

	public String getArticleIds() {
		return articleIds;
	}


	public void setArticleIds(String articleIds) {
		this.articleIds = articleIds;
	}


	public String getSayIds() {
		return sayIds;
	}


	public void setSayIds(String sayIds) {
		this.sayIds = sayIds;
	}


	public String getLinkSina() {
		return linkSina;
	}

	public void setLinkSina(String linkSina) {
		this.linkSina = linkSina;
	}

	public String getLinkQQ() {
		return linkQQ;
	}

	public void setLinkQQ(String linkQQ) {
		this.linkQQ = linkQQ;
	}

	public String getLinkWeiBo() {
		return linkWeiBo;
	}

	public void setLinkWeiBo(String linkWeiBo) {
		this.linkWeiBo = linkWeiBo;
	}

	public String getLinkGithub() {
		return linkGithub;
	}

	public void setLinkGithub(String linkGithub) {
		this.linkGithub = linkGithub;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Master [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", introduce=" + introduce + ", articleIds="
				+ articleIds + ", latelyArticleId=" + latelyArticleId
				+ ", latelySayId=" + latelySayId + ", sayIds=" + sayIds
				+ ", linkSina=" + linkSina + ", LinkQQ=" + linkQQ
				+ ", LinkWeiBo=" + linkWeiBo + ", LinkGithub=" + linkGithub
				+ ", email=" + email + "]";
	}
}
