package com.epam.gmail.test.module.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.gmail.test.util.DriverUtil;

public class SighInPage {
	private static final Logger logger = LogManager.getLogger(SighInPage.class);

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
		DriverUtil.implicitlyWait(driver, 10);
		inputLogin.sendKeys(username);
		buttonNext.click();
		
		DriverUtil.implicitlyWait(driver, 10);
		inputPassword.sendKeys(password);
		buttonSubmit.click();
		logger.info("User is Signed In");
	}
}
