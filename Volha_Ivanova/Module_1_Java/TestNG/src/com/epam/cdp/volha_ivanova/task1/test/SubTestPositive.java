package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubTestPositive extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements positive tests for sub function
	 */
	@Parameters({ "first", "second", "expected" })
	@Test(dataProvider = "dataForSubLong")
	public void SubLong(long first, long second, long expected) {
		long sum = calculator.sub(first, second);
		AssertJUnit.assertEquals(sum, expected);
		checkTime();
	}

	@Parameters({ "first", "second", "expected" })
	@Test(dataProvider = "dataForSubDouble")
	public void SubDouble(double first, double second, double expected) {
		double sum = calculator.sub(first, second);
		AssertJUnit.assertEquals(sum, expected);
		checkTime();
	}

	@DataProvider(name = "dataForSubLong")
	public Object[][] dataForSubLong() {
		return new Object[][] { { 1, 0, 1 }, { 1, 1, 0 }, { -1, 1, -2 }, { -1, -1, 0 }, { 1, -1, 2 } };
	}

	@DataProvider(name = "dataForSubDouble")
	public Object[][] dataForSubDouble() {
		return new Object[][] { { 0.1, 0.1, 0 }, { -0.5, -0.9, 0.4 }, { 9.8, 0.0, 9.8 }, { 0, -1.8, 1.8 },
				{ 7.625, 2.14, 5.485 }, { 5.0, 6.24, -1.24 }, { -5.9, 2.68, -8.58 } };
	}
}