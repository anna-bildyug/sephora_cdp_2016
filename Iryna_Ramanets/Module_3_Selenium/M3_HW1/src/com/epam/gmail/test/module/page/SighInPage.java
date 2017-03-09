package com.epam.gmail.test.module.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SighInPage {

	@FindBy(id = "Email")
	private WebElement inputLogin;

	@FindBy(id = "next")
	private WebElement buttonNext;

	@FindBy(id = "Passwd")
	private WebElement inputPassword;

	@FindBy(id = "signIn")
	private WebElement buttonSubmit;

	public SighInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void userSignIn(WebDriver driver, String username, String password) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		inputLogin.sendKeys(username);
		buttonNext.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		inputPassword.sendKeys(password);
		buttonSubmit.click();
	}

}
