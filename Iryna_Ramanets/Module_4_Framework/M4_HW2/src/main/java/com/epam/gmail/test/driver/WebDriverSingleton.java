package com.epam.gmail.test.driver;

import org.openqa.selenium.WebDriver;

public class WebDriverSingleton {

	private static WebDriver driver;
	
	private static WebDriverCreator creator;

	private WebDriverSingleton() {
	}

	public static void setCreator(WebDriverCreator newCreator) {
		creator = newCreator;
	}
	
	public static WebDriver getWebDriverInstance() {
		if (driver == null) {
			if(creator == null) {
				// create chrome driver by default
				creator = new ChromeDriverCreator();
			}
			driver = new WebDriverDecorator(creator.createWebDriver());
		}
		return driver;
	}

	public static void invalidateWebDriverInstance() {
		driver = null;
	}	
}
