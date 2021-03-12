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

	//构造器
	public DeepCloneableTarget(String cloneName, String cloneClass,Sheep sheep) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
		this.sheep = sheep;
	}

	//因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "DeepCloneableTarget [cloneName=" + cloneName + ", cloneClass=" + cloneClass + ", sheep=" + sheep +"]";
	}
}
