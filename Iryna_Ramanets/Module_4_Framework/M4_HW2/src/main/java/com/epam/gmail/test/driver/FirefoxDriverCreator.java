package com.epam.gmail.test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverCreator implements WebDriverCreator {

	@Override
	public WebDriver createWebDriver() {
		if(System.getProperty("webdriver.gecko.driver") == null) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		}
		return new FirefoxDriver();
	}

}
