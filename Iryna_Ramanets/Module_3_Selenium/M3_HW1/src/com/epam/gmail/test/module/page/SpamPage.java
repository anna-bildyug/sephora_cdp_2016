package com.epam.gmail.test.module.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SpamPage {

	@FindBy(xpath = "//span[text()=\"More\" or text()=\"≈˘∏\"]")
	private WebElement extendOption;

	@FindBy(xpath = "//a[@title=\"Spam\" or @title=\"—Ô‡Ï\"]")
	private WebElement spamFolder;

	public SpamPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyEmailInSpam(WebDriver driver, String subject) {
		WebDriverWait wait = new WebDriverWait(driver, 40);

		wait.until(ExpectedConditions.elementToBeClickable(extendOption))
				.click();

		wait.until(ExpectedConditions.elementToBeClickable(spamFolder)).click();

		By xpath = By.xpath("//*[text()=\"" + subject + "\"]");
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).isDisplayed(),
				"Emails aren't presented in Spam folder.");

		System.out.println("Emails are presented in Spam folder");
	}

}
