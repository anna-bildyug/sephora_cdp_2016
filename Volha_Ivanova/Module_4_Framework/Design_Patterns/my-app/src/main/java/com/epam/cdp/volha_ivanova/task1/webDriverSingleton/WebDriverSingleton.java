package com.epam.cdp.volha_ivanova.task1.webDriverSingleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
	private static WebDriver driver;

	private WebDriverSingleton() {
	}

	public static WebDriver getWebDriverInstance() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static WebDriver initBrowser() {		
		WebDriverSingleton.getWebDriverInstance();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeDriver() {
		driver.quit();
	}
}
