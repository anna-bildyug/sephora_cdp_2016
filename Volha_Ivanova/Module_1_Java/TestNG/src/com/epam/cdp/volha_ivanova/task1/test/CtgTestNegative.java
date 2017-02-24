package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.annotations.Test;

public class CtgTestNegative extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements negative test for sqrt function
	 */
	@Test(expectedExceptions = ArithmeticException.class)
	public void ctgNeg() {
		calculator.ctg(0);
		checkTime();
	}
}
