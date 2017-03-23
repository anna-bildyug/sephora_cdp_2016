package com.epam.cdp.volha_ivanova.task1.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.cdp.volha_ivanova.task1.webDriverSingleton.WebDriverSingleton;

@Test
public class BaseClassTest {
	/**
	 * @autor Volha_Ivanova
	 */
	protected WebDriver driver;

	@BeforeClass(description = "Open browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chrome/chromedriver");
		driver = WebDriverSingleton.initBrowser();
	}

	@AfterClass(alwaysRun = true, description = "Stop Browser")
	public void stopBrowser() {
		WebDriverSingleton.closeDriver();
	}
}
