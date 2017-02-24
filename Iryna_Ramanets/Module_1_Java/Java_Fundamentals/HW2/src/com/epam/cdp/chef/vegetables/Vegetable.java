package com.epam.cdp.chef.vegetables;

import com.epam.cdp.chef.interfaces.ICalculateCalories;

public class Vegetable implements ICalculateCalories, Comparable<Vegetable> {

	private String name;
	private float calories;
	private float weight;

	/**
	 * @param name
	 *            of vegetable
	 * @param calories
	 *            of vegetable per 100 grams
	 * @param weight
	 *            of vegetable
	 */
	public Vegetable(String name, float calories, float weight) {
		this.name = name;
		this.calories = calories;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public float getCalories() {
		return calories;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public float calculateFullCalories() {
		return (weight * calories) / 100;
	}

	@Override
	public String toString() {
		return "{name: " + name + "; calories: " + calories + "; weight: "
				+ weight + "}";
	}

	@Override
	public int compareTo(Vegetable o) {
		return this.getName().compareTo(o.getName());
	}

}
