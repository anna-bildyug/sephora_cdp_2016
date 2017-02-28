package com.epam.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest {
	
	@Test(description = "Simle positive sqrt:", dataProvider = "dataForSqrtPositive", groups = {"positive"})
	public void testSqrtPositive(double first, double expected) {
		double sqrtResult = calculator.sqrt(first);
		Assert.assertEquals(sqrtResult, expected);
	}

	@DataProvider(name = "dataForSqrtPositive")
	public Object[][] dataForSqrtPositive() {
		return new Object[][] {
			{ 4, 2 },
			{ 16, 4 },
			{ 0, 0 }
		};
	}
	
	@Test(description = "Simle negative sqrt:", dataProvider = "dataForSqrtNegative",
			expectedExceptions = Exception.class, groups = {"negative"})
	public void testSqrtNegative(double first) {
		calculator.sqrt(first);
	}

	@DataProvider(name = "dataForSqrtNegative")
	public Object[][] dataForSqrtNegative() {
		return new Object[][] {
			{-4 }   // This a BUG. No exception for negative Sqrt.
		};
	}
	
	
	

}
