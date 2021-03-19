package com.atguigu.proxy.dynamic;

public class TeacherDao implements ITeacherDao {

	@Override
	public String teach() {
		// TODO Auto-generated method stub
		System.out.println(" 老师授课中.... ");
		return " 老师授课中.... ";
	}

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello " + name);
		return "hello " + name;
	}

	public String test(String aa){
		return aa;
	}
	
}
