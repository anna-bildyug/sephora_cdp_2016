package com.epam.gmail.test.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {

	public static WebDriver reopenBrowser(WebDriver driver, String url) {
		driver.quit();
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}
}
