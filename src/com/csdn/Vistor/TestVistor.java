package com.csdn.Vistor;

/**
 * @author ��zhaoy
 * @date ��Created in 2021/3/19 10:10
 * @description��
 * @modified By��
 * @version: 1.0
 */
public class TestVistor {
	public static void main(String[] args) {
		IRecipe recipe = new Meat();
		RestaurantMenu menu = new RestaurantMenu(recipe);
		menu.addRecipe(new Cabbage());
		menu.display(new CustomerA());
	}
}