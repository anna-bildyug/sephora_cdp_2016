package com.epam.gmail.test.module.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.gmail.test.driver.WebDriverSingleton;
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

	public SighInPage() {
		PageFactory.initElements(WebDriverSingleton.getWebDriverInstance(), this);
	}

	public void userSignIn(String username, String password) {
		DriverUtil.implicitlyWait(10);
		inputLogin.sendKeys(username);
		buttonNext.click();
		
		DriverUtil.implicitlyWait(10);
		inputPassword.sendKeys(password);
		buttonSubmit.click();
		logger.info("User is Signed In");
	}
}
