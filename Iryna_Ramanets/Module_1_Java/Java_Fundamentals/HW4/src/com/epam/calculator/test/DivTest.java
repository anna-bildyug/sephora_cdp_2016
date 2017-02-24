package com.epam.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest extends BaseTest {

	@Test(description = "Simle positive long division:", dataProvider = "dataForDivLongPositive",
			groups = {"positive"})
	public void testDivLongPositive(long first, long second, long expected) {
		long div = calculator.div(first, second);
		Assert.assertEquals(div, expected, "");
	}

	@DataProvider(name = "dataForDivLongPositive")
	public Object[][] dataForDivLongPositive() {
		return new Object[][] {
			{ 4, 2, 2 },
			{ 12, 3, 4 },
			{ 6, -3, -2 },
			{ 0, 1, 0 },
			{ -1, 1, 1 }
		};
	}

	@Test(description = "Simle negative long division:", dataProvider = "dataForDivLongNegative",
			expectedExceptions = NumberFormatException.class, groups = {"negative"})
	public void testDivLongNegative(long first, long second) {
		calculator.div(first, second);
	}

	@DataProvider(name = "dataForDivLongNegative")
	public Object[][] dataForDivLongNegative() {
		return new Object[][] {
			{ 4, 0 }    // This is a BUG: no exception for div on 0 for long.
		};
	}
	
	@Test(description = "Simle positive double division:", dataProvider = "dataForDivDoublePositive",
			groups = {"positive"})
	public void testDivDoublePositive(double first, double second, double expected) {
		double div = calculator.div(first, second);
		Assert.assertEquals(div, expected, "");
	}

	@DataProvider(name = "dataForDivDoublePositive")
	public Object[][] dataForDivDoublePositive() {
		return new Object[][] {
			{ 4.4, 2.2, 2.0 },
			{ 12.6, 3.0, 4.2 },
			{ 6.3, -3.0, -2.1 },
			{ -2.2, 2.0, -1.1 },
			{ -2.2, -2.0, 1.1 },
			{ 0.3, 3.0, 0.1 },  // This is a BUG: expected [0.1] but found [0.09999999999999999]
			{ 0.3, 0.3, 1.0 },
			{ 3.0, 0.3, 10.0 }
		};
	}

	@Test(description = "Simle negative double division:", dataProvider = "dataForDivDoubleNegative",
			expectedExceptions = Exception.class, groups = {"negative"})
	public void testDivDoubleNegative(double first, double second) {
		calculator.div(first, second);
	}

	@DataProvider(name = "dataForDivDoubleNegative")  
	public Object[][] dataForDivDoubleNegative() {
		return new Object[][] {
			{ 4.2, 0 }    // This is a BUG: no exception for div on 0 for double.
		};
	}
}
