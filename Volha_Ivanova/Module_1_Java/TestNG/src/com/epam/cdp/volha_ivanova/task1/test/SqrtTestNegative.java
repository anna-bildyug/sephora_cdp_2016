package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.annotations.Test;

@Test(groups = { "Sqrt function" })
public class SqrtTestNegative extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements negative test for sqrt function
	 */
	@Test(expectedExceptions = NumberFormatException.class)
	public void sqrtNeg() {
		calculator.sqrt(-4);
		checkTime();
	}
}
