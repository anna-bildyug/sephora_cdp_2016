package com.epam.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {
	
	@Test(description = "Simle positive tg:", dataProvider = "dataForTgPositive", groups = {"positive"})
	public void testTgPositive(double first, double expected) {
		double tg = calculator.tg(first);
		Assert.assertEquals(tg, expected);
	}

	@DataProvider(name = "dataForTgPositive")
	public Object[][] dataForTgPositive() {
		return new Object[][] {
			{ 45, 1 },
			{ 0, 0 }    //This is a BUG: expected [0.0] but found [NaN].
		};
	}
	
	@Test(description = "Simle negative tg:", dataProvider = "dataForTgNegative",
			expectedExceptions = Exception.class, groups = {"negative"})
	public void testTgNegative(double first) {
		calculator.tg(first);
	}

	@DataProvider(name = "dataForTgNegative")
	public Object[][] dataForTgNegative() {
		return new Object[][] {
			{ 90 }   // This a BUG: no exception for 90 Tg.
		};
	}

}
