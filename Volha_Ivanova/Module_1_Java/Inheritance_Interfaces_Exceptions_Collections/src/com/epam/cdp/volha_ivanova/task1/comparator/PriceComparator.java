package com.epam.cdp.volha_ivanova.task1.comparator;

import java.util.Comparator;

import com.epam.cdp.volha_ivanova.task1.candies.AbstractCandy;

public class PriceComparator implements Comparator<AbstractCandy> {
	/**
	 * @autor Volha_Ivanova. Implements comparator
	 */
	public int compare(AbstractCandy s1, AbstractCandy s2) {
		return s1.getPrice() - s2.getPrice();
	}
}
