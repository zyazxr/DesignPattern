package com.csdn.Vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author £ºzhaoy
 * @date £ºCreated in 2021/3/19 10:10
 * @description£º
 * @modified By£º
 * @version: 1.0
 */

public class RestaurantMenu {
	private List<IRecipe> recipeList = new ArrayList<>();

	public RestaurantMenu(IRecipe recipe) {
		recipeList.add(recipe);
	}

	public void addRecipe(IRecipe recipe){
		recipeList.add(recipe);
	}

	public void display(ICustomer customer){
		for (IRecipe recipe : recipeList){
			recipe.accept(customer);
		}
	}
}