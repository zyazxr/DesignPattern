package com.atguigu.proxy.cglib;

public class TeacherDao {

	public String teach() {
		System.out.println(" ��ʦ�ڿ���  �� ����cglib��������Ҫʵ�ֽӿ� ");
		return "hello";
	}
	public String sayHello(String name) {
		System.out.println(" ��ʦ�ڿ���  �� ����cglib��������Ҫʵ�ֽӿ� ");
		return "hello " + name;
	}
}
