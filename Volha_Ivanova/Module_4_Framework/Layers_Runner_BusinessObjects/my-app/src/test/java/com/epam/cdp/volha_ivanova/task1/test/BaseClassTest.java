package com.epam.cdp.volha_ivanova.task1.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BaseClassTest {
	/**
	 * @autor Volha_Ivanova
	 */
	protected WebDriver driver;

	@BeforeClass(description = "Open browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chrome/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass(alwaysRun = true, description = "Stop Browser")
	public void stopBrowser() {
		driver.quit();
	}
}
