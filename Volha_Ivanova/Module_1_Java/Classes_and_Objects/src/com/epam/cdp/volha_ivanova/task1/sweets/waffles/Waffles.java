package com.epam.cdp.volha_ivanova.task1.sweets.waffles;

import com.epam.cdp.volha_ivanova.task1.sweets.ISweets;

public class Waffles implements ISweets {
	/**
	 * @author Volha_Ivanova 
	 * Constructor for class Waffles. Overriding method addToPresent
	 */
	private String name;
	private int weight;
	private int waffleCount;	

	public Waffles(String name, int weight, int waffleCount) {
		this.name = name;
		this.weight = weight;
		this.waffleCount = waffleCount;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getWaffleCount() {
		return waffleCount;
	}

	@Override
	public void evaluateGiftWeight() {
	}
}
