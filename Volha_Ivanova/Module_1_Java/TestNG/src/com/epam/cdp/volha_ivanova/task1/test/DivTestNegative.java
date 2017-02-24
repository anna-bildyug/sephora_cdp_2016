package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.annotations.Test;

public class DivTestNegative extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements negative test for div function
	 */
	@Test(expectedExceptions = NumberFormatException.class, 
			expectedExceptionsMessageRegExp = "Attempt to divide by zero")
	public void divZero() {
		calculator.div(1, 0);
		checkTime();
	}
}