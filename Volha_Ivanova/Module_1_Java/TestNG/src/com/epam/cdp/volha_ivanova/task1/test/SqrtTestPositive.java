package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = { "Sqrt function" })
public class SqrtTestPositive extends BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements positive tests for sqrt function
	 */
	@Parameters({ "first", "expected" })
	@Test(dataProvider = "dataForSqrtDouble")
	public void sqrtDouble(double first, double expected) {
		double sqrt = calculator.sqrt(first);
		AssertJUnit.assertEquals(sqrt, expected);
		checkTime();
	}

	@DataProvider(name = "dataForSqrtDouble")
	public Object[][] dataForSqrtDouble() {
		return new Object[][] { 
			{ 0, 0 }, 
			{ 1, 1 }, 
			{ 0.0016, 0.04 }, 
			{ 0.0000000001, 0.00001 } };
	}
}
