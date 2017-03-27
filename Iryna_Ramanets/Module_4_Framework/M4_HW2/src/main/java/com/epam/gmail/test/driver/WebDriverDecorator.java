package com.epam.gmail.test.driver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class WebDriverDecorator implements WebDriver {

	private WebDriver driver;

	public WebDriverDecorator(WebDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void close() {
		driver.close();
	}

	@Override
	public WebElement findElement(By by) {
		Reporter.log("Finding element by " + by.toString() + " at " + driver.getCurrentUrl());
		return driver.findElement(by);
	}

	@Override
	public List<WebElement> findElements(By by) {
		Reporter.log("Finding elements by " + by.toString() + " at " + driver.getCurrentUrl());
		return driver.findElements(by);
	}

	@Override
	public void get(String url) {
		driver.get(url);
	}

	@Override
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	@Override
	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	@Override
	public Options manage() {
		return driver.manage();
	}

	@Override
	public Navigation navigate() {
		return driver.navigate();
	}

	@Override
	public void quit() {
		driver.quit();
	}

	@Override
	public TargetLocator switchTo() {
		return driver.switchTo();
	}
}
