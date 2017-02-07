package com.epam.cdp.volha_ivanova.task1.sweets.candies.lollipop;

import com.epam.cdp.volha_ivanova.task1.sweets.candies.Candies;

public class Lollipop extends Candies {
	/**
	 * @author Volha_Ivanova 
	 * Constructor for class Lollipop
	 */
	private String name;
	private int lollipopCount;
	private int weight;	

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
	public void evaluateGiftWeight() {	
	}
}
