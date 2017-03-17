package com.epam.gmail.test.module.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.gmail.test.util.DriverUtil;

public class SpamPage {
	private static final Logger logger = LogManager.getLogger(SpamPage.class);

	@FindBy(xpath = "//span[text()=\"More\" or text()=\"Ещё\"]")
	private WebElement extendOption;

	@FindBy(xpath = "//a[@title=\"Spam\" or @title=\"Спам\"]")
	private WebElement spamFolder;

	public SpamPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyEmailInSpam(WebDriver driver, String subject) {
		DriverUtil.waitForElementToBeClickable(driver, extendOption).click();

		DriverUtil.waitForElementToBeClickable(driver, spamFolder).click();

		By xpath = By.xpath("//*[text()=\"" + subject + "\"]");
		Assert.assertTrue(DriverUtil.waitForVisibilityOf(driver, xpath).isDisplayed(),
				"Emails aren't presented in Spam folder.");

		//System.out.println("Emails are presented in Spam folder");
		logger.info("Emails are presented in Spam folder");
	}

}
