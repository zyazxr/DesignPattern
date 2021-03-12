package com.atguigu.prototype.deepclone;

import com.atguigu.prototype.improve.Sheep;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DeepProtoType p = new DeepProtoType();
		p.name = "宋江";
		Sheep sheep =  new Sheep("tom", 1, "白色");
		p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛",sheep);
		
		//方式1 完成深拷贝
		
//		DeepProtoType p2 = (DeepProtoType) p.clone();
//
//		System.out.println("p.name=" + p.name + "   p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode()+"   p.sheep=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode()+"   p.sheep=" + p2.deepCloneableTarget.hashCode());
//		System.out.println( p.deepCloneableTarget.toString());
		//方式2 完成深拷贝
		DeepProtoType p2 = (DeepProtoType) p.deepClone();

		System.out.println("p.name=" + p.name + "   p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
	
	}

}
