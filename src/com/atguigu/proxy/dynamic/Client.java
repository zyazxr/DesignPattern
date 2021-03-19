package com.atguigu.proxy.dynamic;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Ŀ�����
		TeacherDao target = new TeacherDao();

		//��Ŀ����󣬴����������, ����ת�� ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(new TeacherDao()).getProxyInstance();
	
		// proxyInstance=class com.sun.proxy.$Proxy0 �ڴ��ж�̬�����˴������
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		
		//ͨ��������󣬵���Ŀ�����ķ���
		String a = proxyInstance.teach();
		System.out.println("aaaa : "+a);
		
		proxyInstance.sayHello(" tom ");

	}

}
