package com.csdn.Vistor;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 10:08
 * @description��
 * @modified By��
 * @version: 1.0
 */

public class Cabbage implements IRecipe {
	@Override
	public void accept(ICustomer customer) {
		customer.visit(this);
	}

	public String getPrice(){
		return "44Ԫ/��";
	}
}