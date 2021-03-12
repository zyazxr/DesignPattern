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

//使用枚举，可以实现单例, 推荐
enum Singleton {
	//属性
	INSTANCE;

	public void sayOk() {
		System.out.println("ok~");
	}
	public Singleton getInstance(){
		return INSTANCE;
	}
}