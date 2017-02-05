package com.epam.cdp.volha_ivanova.task1;

public class ChocolateCandies extends Candies implements ISweets {
	/**
	 * @author Volha_Ivanova Constructor for class ChocolateCandies. Overriding
	 *         method addToPresent
	 */
	private String name;
	private int chocoCandiesCount;
	private int weight;
	private int giftWeight;

	public ChocolateCandies(String name, int weight, int chocoCandiesCount) {
		this.name = name;
		this.weight = weight;
		this.chocoCandiesCount = chocoCandiesCount;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getChocoCandiesCount() {
		return chocoCandiesCount;
	}

	@Override
	public int addToPresent() {
		giftWeight += getWeight() * getChocoCandiesCount();
		return giftWeight;
	}
}
