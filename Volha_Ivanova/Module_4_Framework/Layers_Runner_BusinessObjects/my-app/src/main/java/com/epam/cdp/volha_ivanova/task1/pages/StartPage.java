package com.epam.cdp.volha_ivanova.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
	/**
	 * @author Volha_Ivanova Open browser and navigate to Gmail start page.
	 */
	public static final String BASE_URL = "https://accounts.google.com";
	private WebDriver driver;

	public StartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void open() {
		driver.get(BASE_URL);
		driver.manage().window().maximize();
	}
}