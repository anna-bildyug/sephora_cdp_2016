package com.epam.cdp.volha_ivanova.task1;

import com.epam.cdp.volha_ivanova.task1.sweets.Gift;

public class Runner {
	/**
	 * @author Volha_Ivanova 
	 * Implements calculating weight of the present according to number of sweets that enter user. Sort sweets according to number in the present. Find sweet weight by its name.
	 */
	public static void main(String[] args) {
		System.out.println("How many \n waffles \n white chocolates \n dark chocolates \n milk chocolates \n chocolate candies \n lollipops \n do you want to add to the present?");
		Gift gift = new Gift();		
		gift.evaluateGiftWeight();
		gift.sortCandies();
		gift.findCandy();		
	}
}
