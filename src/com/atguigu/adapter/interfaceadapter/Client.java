package com.atguigu.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		
		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("使用了m1的方法");
			}
		};
//		AbsAdapter absAdapter2 = new AbsAdapter(()->System.out.println("aaa")) ;
//		Thread a = new Thread(() -> System.out.println("aa"));
		
		absAdapter.m1();


	}
}
