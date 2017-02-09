package com.epam.cdp.chef.salad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.cdp.chef.interfaces.ICaloriesCalculatable;
import com.epam.cdp.chef.vegetables.Vegetable;

public class Salad implements ICaloriesCalculatable {

	private List<Vegetable> ingredients = new ArrayList<Vegetable>();

	/**
	 * @return list of ingredients
	 */
	public List<Vegetable> getIngredients() {
		return ingredients;
	}

	/**
	 * Adding vegetable to the salad
	 * 
	 * @param veg
	 */
	public void add(Vegetable veg) {
		ingredients.add(veg);
	}

	/**
	 * Searching vegetable by name
	 * 
	 * @param name
	 *            of vegetable in salad
	 * @return vegetable or null in case no matches
	 */
	public Vegetable find(String name) {
		for (Vegetable veg : ingredients) {
			if (veg.getName().equals(name)) {
				return veg;
			}
		}
		return null;
	}

	/**
	 * Searching vegetable by full calories
	 * 
	 * @param calories
	 *            of vegetable in salad
	 * @return vegetable or null in case no matches
	 */
	public Vegetable find(float calories) {
		for (Vegetable veg : ingredients) {
			if (veg.calculateFullCalories() == calories) {
				return veg;
			}
		}
		return null;
	}
	
	/**
	 * Sorting ingredients by name
	 */
	public void sortByName() {
		Collections.sort(ingredients);
	}

	@Override
	public float calculateFullCalories() {
		float sum = 0;
		for (Vegetable veg : ingredients) {
			sum += veg.calculateFullCalories();
		}
		return sum;
	}
}
