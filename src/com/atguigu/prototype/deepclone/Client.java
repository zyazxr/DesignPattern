package com.atguigu.prototype.deepclone;

import com.atguigu.prototype.improve.Sheep;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DeepProtoType p = new DeepProtoType();
		p.name = "�ν�";
		Sheep sheep =  new Sheep("tom", 1, "��ɫ");
		p.deepCloneableTarget = new DeepCloneableTarget("��ţ", "Сţ",sheep);
		
		//��ʽ1 ������
		
//		DeepProtoType p2 = (DeepProtoType) p.clone();
//
//		System.out.println("p.name=" + p.name + "   p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode()+"   p.sheep=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode()+"   p.sheep=" + p2.deepCloneableTarget.hashCode());
//		System.out.println( p.deepCloneableTarget.toString());
		//��ʽ2 ������
		DeepProtoType p2 = (DeepProtoType) p.deepClone();

		System.out.println("p.name=" + p.name + "   p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
	
	}

}
