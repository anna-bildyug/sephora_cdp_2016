package com.epam.gmail.test.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtil {

	public static WebDriver reopenBrowser(WebDriver driver, String url) {
		driver.quit();
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}
	
	public static void implicitlyWait(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static WebElement waitForVisibilityOf(WebDriver driver, WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		return wait.until(ExpectedConditions.visibilityOf(webElement));
	}
	
	public static WebElement waitForVisibilityOf(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		return wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public static WebElement waitForElementToBeClickable(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
}
