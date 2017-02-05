package com.epam.cdp.volha_ivanova.task1;

public class Chocolate implements ISweets {
	/**
	 * @author Volha_Ivanova Constructor for class Chocolate. Overriding method
	 *         addToPresent
	 */
	private String type;
	private String name;
	private int chocolateCount;
	private int weight;
	private int giftWeight;
	
	public Chocolate(String name, String type, int weight, int chocolateCount) {
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.chocolateCount = chocolateCount;
	}
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}
	public int getChocolateCount() {
		return chocolateCount;
	}
		
	@Override
	public int addToPresent() {
		giftWeight += getWeight()*getChocolateCount();
		return giftWeight;
		
	}
}
