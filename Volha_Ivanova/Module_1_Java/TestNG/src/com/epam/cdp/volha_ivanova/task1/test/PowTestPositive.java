package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTestPositive extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements positive tests for pow function
	 */
	@Parameters({ "first", "second", "expected" })
	@Test(dataProvider = "dataForPowDouble")
	public void powDouble(double first, double second, double expected) {
		double pow = calculator.pow(first, second);
		AssertJUnit.assertEquals(pow, expected);
		checkTime();
	}

	@DataProvider(name = "dataForPowDouble")
	public Object[][] dataForPowDouble() {
		return new Object[][] { 
			{ 2, 5, 32 }, 
			{ 2, -5, 0.03125 }, 
			{ 2, 0, 1 }, 
			{ 4, 0.5, 2 }, 
			{ 4, -0.5, 0.5 },
			{ -3, 4, 81 }, 
			{ -2, -1, -0.5 }, 
			{ -3, 0, 1 }, 
			{ 0, 3, 1 }, 
			{ 0, 0, 1 } };
	}
}