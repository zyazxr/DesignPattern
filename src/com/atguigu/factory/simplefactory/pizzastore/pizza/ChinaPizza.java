package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author ：zhaoy
 * @date ：Created in 2021/3/11 16:42
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ChinaPizza  extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(" 给中国披萨 准备原材料 ");
	}

}
