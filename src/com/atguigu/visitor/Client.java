package com.atguigu.visitor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
//		new Man().accept(new Fail());
		Man test = new Man();
		test.accept(new Fail());
		objectStructure.attach(test);
		objectStructure.attach(new Woman());
		
		
		//成功
//		Success success = new Success();
		objectStructure.display();
		
		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======给的是待定的测评========");
		
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
