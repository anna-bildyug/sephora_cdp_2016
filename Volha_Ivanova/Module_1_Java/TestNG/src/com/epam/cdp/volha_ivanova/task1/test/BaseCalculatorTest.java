package com.epam.cdp.volha_ivanova.task1.test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

@Test(groups = {"Sqrt function"})
public class BaseCalculatorTest {
	/**
	 * @autor Volha_Ivanova
	 * Implements basic class for calculator with Before* and After* methods
	 */
	protected Calculator calculator;
	
	@BeforeSuite
	  public void beforeSuite() {
		System.out.println("Before suite");
	  }
	 @BeforeClass(groups = "config")
  public void setUp() {
	  System.out.println("Create instance of Calculator");
	  calculator = new Calculator();
	  }
	@BeforeMethod
	  public void beforeMethod() {
		System.out.println("Before method");
	  }
 
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }  
  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }
  protected void checkTime() {
	  System.out.println("Current time: " + new Date(System.currentTimeMillis()));
  }
}
