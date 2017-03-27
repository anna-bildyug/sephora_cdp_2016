package com.epam.cdp.volha_ivanova.task1.webDriverSingleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver driver;

	public static WebDriver initBrowser() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeDriver() {
		driver.quit();
	}
}
