package com.epam.cdp.volha_ivanova.task1;

public class Lollipop extends Candies implements ISweets {
	/**
	 * @author Volha_Ivanova Constructor for class Lollipop. Overriding method
	 *         addToPresent
	 */
	private String name;
	private int lollipopCount;
	private int weight;
	private int giftWeight;

	public Lollipop(String name, int weight, int lollipopCount) {
		this.name = name;
		this.weight = weight;
		this.lollipopCount = lollipopCount;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getLollipopCount() {
		return lollipopCount;
	}

	@Override
	public int addToPresent() {
		giftWeight += getWeight() * getLollipopCount();
		return giftWeight;
	}
}
