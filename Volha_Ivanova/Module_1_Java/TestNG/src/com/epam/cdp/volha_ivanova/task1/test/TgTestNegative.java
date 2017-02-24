package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.annotations.Test;

public class TgTestNegative extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements negative test for tg function
	 */
	private static final double PI = 3.141592653589793238462643383279;

	@Test(expectedExceptions = ArithmeticException.class)
	public void tgNeg() {
		calculator.tg(PI / 2);
		checkTime();
	}
}
