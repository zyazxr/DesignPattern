package com.atguigu.singleton.type8;

public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);

		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

		instance.sayOk();
		Singleton.INSTANCE.getInstance().sayOk();
		System.out.println(Runtime.getRuntime());
	}
}

//ʹ��ö�٣�����ʵ�ֵ���, �Ƽ�
enum Singleton {
	//����
	INSTANCE;

	public void sayOk() {
		System.out.println("ok~");
	}
	public Singleton getInstance(){
		return INSTANCE;
	}
}