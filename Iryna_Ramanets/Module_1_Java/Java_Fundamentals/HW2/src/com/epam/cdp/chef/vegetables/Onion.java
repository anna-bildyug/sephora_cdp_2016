package com.epam.cdp.chef.vegetables;

public class Onion extends Vegetable {


	public static float DEFAULT_CALORIES = 50;

	/**
	 * @param calories
	 *            of vegetable per 100 grams
	 * @param weight
	 *            of vegetable
	 */
	public Onion(float calories, float weight) {
		super("Onion", calories, weight);
	}

	/**
	 * Onion with default calories
	 * @param weight
	 *            of vegetable
	 */
	public Onion(float weight) {
		this(DEFAULT_CALORIES, weight);
	}
}
