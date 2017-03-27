package com.epam.gmail.test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator implements WebDriverCreator {

	@Override
	public WebDriver createWebDriver() {
		if(System.getProperty("webdriver.chrome.driver") == null) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}
		return new ChromeDriver();
	}

}
