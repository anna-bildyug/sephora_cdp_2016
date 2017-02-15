package com.epam.cdp.chef.salad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.cdp.chef.exceptions.EmptySaladException;
import com.epam.cdp.chef.exceptions.IllegalVegetableException;
import com.epam.cdp.chef.exceptions.VegetableNotFoundException;
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
	 * @throws IllegalVegetableException
	 *             if vegetable has incorrect name or calories or weight
	 */
	public void add(Vegetable veg) throws IllegalVegetableException {
		if (veg.getName() == null || veg.getName().isEmpty()) {
			throw new IllegalVegetableException("Incorrect name!");
		}
		if (veg.getCalories() <= 0) {
			throw new IllegalVegetableException("Incorrect calories!");
		}
		if (veg.getWeight() <= 0) {
			throw new IllegalVegetableException("Incorrect weight!");
		}
		ingredients.add(veg);
	}

	/**
	 * Searching vegetable by name
	 * 
	 * @param name
	 *            of vegetable in salad
	 * @return list of vegetables
	 * @throws VegetableNotFoundException
	 *             if name is null or empty
	 */
	public List<Vegetable> findByName(String name)
			throws VegetableNotFoundException {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null!");
		}
		List<Vegetable> result = new ArrayList<Vegetable>();
		for (Vegetable veg : ingredients) {
			if (veg.getName().equals(name)) {
				result.add(veg);
			}
		}
		if (result.size() == 0) {
			throw new VegetableNotFoundException();
		}
		return result;
	}

	/**
	 * Searching vegetable by full calories
	 * 
	 * @param calories
	 *            of vegetable in salad
	 * @return list of vegetables
	 * @throws VegetableNotFoundException
	 *             if calories less or equal 0
	 */
	public List<Vegetable> findByCalories(float calories)
			throws VegetableNotFoundException {
		if (calories <= 0) {
			throw new IllegalArgumentException(
					"Calories must be greater than 0!");
		}
		List<Vegetable> result = new ArrayList<Vegetable>();
		for (Vegetable veg : ingredients) {
			if (veg.calculateFullCalories() == calories) {
				result.add(veg);
			}
		}
		if (result.size() == 0) {
			throw new VegetableNotFoundException();
		}
		return result;
	}

	/**
	 * Sorting ingredients by name
	 * 
	 * @throws EmptySaladException
	 *             if ingredients list is empty
	 */
	public void sortByName() throws EmptySaladException {
		if (ingredients.size() == 0) {
			throw new EmptySaladException();
		}
		Collections.sort(ingredients);
	}

	/**
	 * @return full calories of item
	 * @throws IllegalStateException
	 *             if list of ingredients is empty
	 */
	@Override
	public float calculateFullCalories() throws IllegalStateException {
		if (ingredients.size() == 0) {
			throw new IllegalStateException(
					"Cannot calculate calories for empty list of ingredients!");
		}
		float sum = 0;
		for (Vegetable veg : ingredients) {
			sum += veg.calculateFullCalories();
		}
		return sum;
	}
}
