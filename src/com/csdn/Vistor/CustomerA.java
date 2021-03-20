package com.csdn.Vistor;

/**
 * @author £∫zhaoy
 * @date £∫Created in 2021/3/19 10:10
 * @description£∫
 * @modified By£∫
 * @version: 1.0
 */

public class CustomerA implements ICustomer{
	@Override
	public void visit(Meat meat) {
		System.out.println("»‚¿‡£∫" + meat.getPrice());
	}

	@Override
	public void visit(Cabbage cabbage) {
		System.out.println(" ± ﬂ£∫" + cabbage.getPrice());
	}
}