package com.epam.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {
	
	@Test(description = "Simle positive isNegative:", dataProvider = "dataForIsNegative", groups = {"positive"})
	public void testIsNegative(long first, boolean expected) {
		boolean isNegative = calculator.isNegative(first);
		Assert.assertEquals(isNegative, expected);
	}

	@DataProvider(name = "dataForIsNegative")
	public Object[][] dataForIsNegative() {
		return new Object[][] {
			{-50, true},
			{50, false}
		};
	}

}
