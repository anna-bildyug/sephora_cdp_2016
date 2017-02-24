package com.epam.cdp.chef.vegetables;

public class Tomato extends Vegetable {

	public static float DEFAULT_CALORIES = 100;

	/**
	 * @param calories
	 *            of vegetable per 100 grams
	 * @param weight
	 *            of vegetable
	 */
	public Tomato(float calories, float weight) {
		super("Tomato", calories, weight);
	}

	/**
	 * Tomato with default calories
	 * @param weight
	 *            of vegetable
	 */
	public Tomato(float weight) {
		this(DEFAULT_CALORIES, weight);
	}
}
