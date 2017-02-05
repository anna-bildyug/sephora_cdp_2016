package com.epam.cdp.volha_ivanova.task1;

public class Waffles implements ISweets {
	/**
	 * @author Volha_Ivanova Constructor for class Waffles. Overriding method
	 *         addToPresent
	 */
	private String name;
	private int weight;
	private int waffleCount;
	private int giftWeight;

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
	public int addToPresent() {
		giftWeight += getWeight() * getWaffleCount();
		return giftWeight;
	}
}
