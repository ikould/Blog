package com.ikould.blog.entity;

import org.springframework.stereotype.Component;


/**
 * ������
 * <p>
 * ��½������վ���û�
 * 
 * @author ikould
 *
 */
@Component
public class Master {
	// ���ݱ�id
	private int id;
	// ����
	private String name;
	// ����
	private int age;
	// �Ա�
	private int sex;
	// ���˼��
	private String introduce;
	// ����id���飬��","�ָ�
	private String articleIds;
	// �������id
	private int latelyArticleId;
	// ���˵˵id
	private int latelySayId;
	// ˵˵id���飬��","�ָ�
	private String sayIds;
	// ���˵�ַ
	private String linkSina;
	// QQ��ַ
	private String linkQQ;
	// ΢����ַ
	private String linkWeiBo;
	// Github��ַ
	private String linkGithub;
	// ����
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
