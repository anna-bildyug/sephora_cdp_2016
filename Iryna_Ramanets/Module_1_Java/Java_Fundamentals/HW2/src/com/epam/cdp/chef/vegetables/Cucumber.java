package com.epam.cdp.chef.vegetables;

public class Cucumber extends Vegetable {

	public static float DEFAULT_CALORIES = 75;

	/**
	 * @param calories
	 *            of vegetable per 100 grams
	 * @param weight
	 *            of vegetable
	 */
	public Cucumber(float calories, float weight) {
		super("Cucumber", calories, weight);
	}

	/**
	 * Cucumber with default calories
	 * @param weight
	 *            of vegetable
	 */
	public Cucumber(float weight) {
		this(DEFAULT_CALORIES, weight);
	}
}
