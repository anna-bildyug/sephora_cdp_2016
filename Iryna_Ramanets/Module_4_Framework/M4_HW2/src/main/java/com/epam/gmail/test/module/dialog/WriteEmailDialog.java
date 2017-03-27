package com.epam.gmail.test.module.dialog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.gmail.test.driver.WebDriverSingleton;
import com.epam.gmail.test.util.DriverUtil;

public class WriteEmailDialog {
	private static final Logger logger = LogManager.getLogger(WriteEmailDialog.class);

	@FindBy(xpath = "//div[text()=\"COMPOSE\" or text()=\"НАПИСАТЬ\"]")
	private WebElement buttonWriteEmail;

	@FindBy(xpath = "//textarea[@name=\"to\"]")
	private WebElement fillEmail;

	@FindBy(xpath = "//input[@name=\"subjectbox\"]")
	private WebElement subjectEmail;

	@FindBy(xpath = "//div[text()=\"Send\" or text()=\"Отправить\"]")
	private WebElement buttonSendEmail;

	@FindBy(xpath = "//div[@role=\"alert\"]")
	private WebElement alert;

	public WriteEmailDialog() {
		PageFactory.initElements(WebDriverSingleton.getWebDriverInstance(), this);
	}

	public void writeEmail(String address, String subject) {
		DriverUtil.waitForElementToBeClickable(buttonWriteEmail).click();

		logger.info("Write email dialog open");
		fillEmail.sendKeys(address);
		subjectEmail.sendKeys(subject);
		buttonSendEmail.click();

		DriverUtil.waitForVisibilityOf(alert); 
		logger.info("Email has been sent");
	}
	
}
