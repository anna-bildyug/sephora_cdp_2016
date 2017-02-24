package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class SumTestPositive extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements positive tests for sum function
	 */
	@Parameters({ "first", "second", "expected" })
	@Test(dataProvider = "dataForSumLong")
	public void sumLong(long first, long second, long expected) {
		long sum = calculator.sum(first, second);
		AssertJUnit.assertEquals(sum, expected);
		checkTime();
	}

	@Parameters({ "first", "second", "expected" })
	@Test(dataProvider = "dataForSumDouble")
	public void sumDouble(double first, double second, double expected) {
		double sum = calculator.sum(first, second);
		AssertJUnit.assertEquals(sum, expected);
		checkTime();
	}

	@DataProvider(name = "dataForSumLong")
	public Object[][] dataForSumLong() {
		return new Object[][] { 
			{ 1, 0, 1 }, 
			{ 1, 1, 2 }, 
			{ -1, 1, 0 }, 
			{ -1, -1, -2 } };
	}

	@DataProvider(name = "dataForSumDouble")
	public Object[][] dataForSumDouble() {
		return new Object[][] { 
			{ 0.1, 0.2, 0.3 }, 
			{ -0.5, -0.9, -1.4 }, 
			{ 9.8, 0.0, 9.8 }, 
			{ 0, -1.8, -1.8 },
			{ 7.625, -2.14, 5.485 }, 
			{ 5.0, -6.24, -1.24 }, 
			{ -5.9, 2.68, -3.22 } };
	}
}
