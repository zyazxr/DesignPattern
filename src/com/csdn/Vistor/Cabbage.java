package com.csdn.Vistor;

/**
 * @author £ºzhaoy
 * @date £ºCreated in 2021/3/19 10:08
 * @description£º
 * @modified By£º
 * @version: 1.0
 */

public class Cabbage implements IRecipe {
	@Override
	public void accept(ICustomer customer) {
		customer.visit(this);
	}

	public String getPrice(){
		return "44Ôª/·Ý";
	}
}