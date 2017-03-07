package com.epam.gmail.test.module.dialog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WriteEmailDialog {

	@FindBy(xpath = "//div[text()=\"COMPOSE\" or text()=\"Õ¿œ»—¿“‹\"]")
	private WebElement buttonWriteEmail;

	@FindBy(xpath = "//textarea[@name=\"to\"]")
	private WebElement fillEmail;

	@FindBy(xpath = "//input[@name=\"subjectbox\"]")
	private WebElement subjectEmail;

	@FindBy(xpath = "//div[text()=\"Send\" or text()=\"ŒÚÔ‡‚ËÚ¸\"]")
	private WebElement buttonSendEmail;

	@FindBy(xpath = "//div[@role=\"alert\"]")
	private WebElement alert;

	public WriteEmailDialog(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void writeEmail(WebDriver driver, String address, String subject) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(buttonWriteEmail))
				.click();

		fillEmail.sendKeys(address);
		subjectEmail.sendKeys(subject);
		buttonSendEmail.click();

		wait.until(ExpectedConditions.visibilityOf(alert));
	}
	
}
