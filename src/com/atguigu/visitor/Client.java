package com.atguigu.visitor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
//		new Man().accept(new Fail());
		Man test = new Man();
		test.accept(new Fail());
		objectStructure.attach(test);
		objectStructure.attach(new Woman());
		
		
		//�ɹ�
//		Success success = new Success();
		objectStructure.display();
		
		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======�����Ǵ����Ĳ���========");
		
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
