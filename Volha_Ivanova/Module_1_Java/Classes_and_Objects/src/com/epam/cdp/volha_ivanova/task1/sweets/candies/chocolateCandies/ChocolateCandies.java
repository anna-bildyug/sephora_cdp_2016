package com.epam.cdp.volha_ivanova.task1.sweets.candies.chocolateCandies;

import com.epam.cdp.volha_ivanova.task1.sweets.candies.Candies;

public class ChocolateCandies extends Candies {
	/**
	 * @author Volha_Ivanova 
	 * Constructor for class ChocolateCandies
	 */
	private String name;
	private int chocoCandiesCount;
	private int weight;	

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
	public void evaluateGiftWeight() {			
	}	
}
