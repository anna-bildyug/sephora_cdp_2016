package com.epam.cdp.volha_ivanova.task1.sweets.chocolate;

import com.epam.cdp.volha_ivanova.task1.sweets.ISweets;

public class Chocolate implements ISweets {
	/**
	 * @author Volha_Ivanova 
	 * Constructor for class Chocolate
	 */
	private String type;
	private String name;
	private int chocolateCount;
	private int weight;
	
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
	public void evaluateGiftWeight() {	
	}
}
