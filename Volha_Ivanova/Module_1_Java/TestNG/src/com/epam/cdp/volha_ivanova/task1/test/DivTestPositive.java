package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivTestPositive extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements positive tests for div function
	 */
	@Parameters({ "first", "second", "expected" })
	@Test(dataProvider = "dataForDivLong")
	public void divLong(long first, long second, long expected) {
		long div = calculator.div(first, second);
		AssertJUnit.assertEquals(div, expected);
		checkTime();
	}

	@DataProvider(name = "dataForDivLong")
	public Object[][] dataForDivLong() {
		return new Object[][] { { 11, 5, 2 }, { 6, 2, 3 }, { -11, 5, -2 }, { 5, 6, 0 } };
	}

	@Parameters({ "first", "second", "expected" })
	@Test(dataProvider = "dataForDivDouble")
	public void divLong(double first, double second, double expected) {
		double div = calculator.div(first, second);
		AssertJUnit.assertEquals(div, expected);
	}

	@DataProvider(name = "dataForDivDouble")
	public Object[][] dataForDivDouble() {
		return new Object[][] { { 11.1, 5, 2.22 }, { 0.6, 0.2, 3 }, { 1.5, -0.1, -15 } };
	}
}