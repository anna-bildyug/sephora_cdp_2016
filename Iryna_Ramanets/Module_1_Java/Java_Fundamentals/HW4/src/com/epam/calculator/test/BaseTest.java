package com.epam.calculator.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.epam.tat.module4.Calculator;

public class BaseTest {

	protected Calculator calculator;

	@BeforeClass(groups = { "positive", "negative" })
	public void beforeClass() {
		calculator = new Calculator();
	}

	@BeforeMethod(groups = { "positive", "negative" })
	public void beforeMethod() {

	}

	@AfterMethod(groups = { "positive", "negative" })
	public void afterMethod() {
		System.out.println();
	}
	
}
