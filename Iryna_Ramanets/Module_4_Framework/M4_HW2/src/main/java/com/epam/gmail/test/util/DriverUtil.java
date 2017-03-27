package com.epam.gmail.test.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.gmail.test.driver.WebDriverSingleton;

public class DriverUtil {

	public static void reopenBrowser(String url) {
		WebDriverSingleton.getWebDriverInstance().quit();
		WebDriverSingleton.invalidateWebDriverInstance();
		WebDriverSingleton.getWebDriverInstance().get(url);
	}
	
	public static void implicitlyWait(long seconds) {
		WebDriverSingleton.getWebDriverInstance().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static WebElement waitForVisibilityOf(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getWebDriverInstance(), 40);
		return wait.until(ExpectedConditions.visibilityOf(webElement));
	}
	
	public static WebElement waitForVisibilityOf(By by) {
		WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getWebDriverInstance(), 40);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static WebElement waitForElementToBeClickable(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getWebDriverInstance(), 40);
		return wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public static WebElement waitForElementToBeClickable(By by) {
		WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getWebDriverInstance(), 40);
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
}
