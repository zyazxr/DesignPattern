package com.atguigu.prototype.deepclone;

import com.atguigu.prototype.improve.Sheep;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	private Sheep sheep;

	//������
	public DeepCloneableTarget(String cloneName, String cloneClass,Sheep sheep) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
		this.sheep = sheep;
	}

	//��Ϊ��������ԣ�����String , �����������ʹ��Ĭ�ϵ�clone��ɼ���
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "DeepCloneableTarget [cloneName=" + cloneName + ", cloneClass=" + cloneClass + ", sheep=" + sheep +"]";
	}
}
