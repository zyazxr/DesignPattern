package com.atguigu.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		
		AbsAdapter absAdapter = new AbsAdapter() {
			//ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("ʹ����m1�ķ���");
			}
		};
//		AbsAdapter absAdapter2 = new AbsAdapter(()->System.out.println("aaa")) ;
//		Thread a = new Thread(() -> System.out.println("aa"));
		
		absAdapter.m1();


	}
}
