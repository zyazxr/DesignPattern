package com.biancheng.principle;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/12 9:18
 * @description��
 * @modified By��
 * @version: 1.0
 */

public class LoDtest {
	public static void main(String[] args) {
		Agent agent = new Agent();
		agent.setStar(new Star("������"));
		agent.setFans(new Fans("��˿��ة"));
		agent.setCompany(new Company("�й���ý���޹�˾"));
		agent.meeting();
		agent.business();
	}
}

//������
class Agent {
	private Star myStar;
	private Fans myFans;
	private Company myCompany;

	public void setStar(Star myStar) {
		this.myStar = myStar;
	}

	public void setFans(Fans myFans) {
		this.myFans = myFans;
	}

	public void setCompany(Company myCompany) {
		this.myCompany = myCompany;
	}

	public void meeting() {
		System.out.println(myFans.getName() + "������" + myStar.getName() + "�����ˡ�");
	}

	public void business() {
		System.out.println(myCompany.getName() + "������" + myStar.getName() + "Ǣ��ҵ��");
	}
}

//����
class Star {
	private String name;

	Star(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

//��˿
class Fans {
	private String name;

	Fans(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

//ý�幫˾
class Company {
	private String name;

	Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}