package com.epam.cdp.volha_ivanova.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	/**
	 * @author Volha_Ivanova Performs signIn method.
	 */
	@FindBy(id = "Email")
	private WebElement inputLogin;

	@FindBy(id = "Passwd")
	private WebElement inputPassword;

	@FindBy(id = "next")
	private WebElement buttonNext;

	@FindBy(id = "signIn")
	private WebElement buttonSignIn;

	protected WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public StartPage signIn(String username, String password) {
		inputLogin.sendKeys(username);
		buttonNext.click();
		inputPassword.sendKeys(password);
		buttonSignIn.click();
		return new StartPage(driver);
	}
}