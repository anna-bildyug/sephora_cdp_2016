package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.annotations.Test;

public class PowTestNegative extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements negative tests for pow function
	 */
	@Test(expectedExceptions = NumberFormatException.class)
	public void powNeg() {
		calculator.pow(-4, 0.5);
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void powZero() {
		calculator.pow(0, -5);
	}
}
