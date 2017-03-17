package com.epam.cdp.volha_ivanova.task1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewEmailPopup {
	/**
	 * @author Volha_Ivanova
	 */
	private WebDriver driver;

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
	private WebElement buttonNewLetter;

	@FindBy(xpath = "//textarea[(@class = 'vO') and (@name='to')]")
	private WebElement inputRecipientEmail;

	@FindBy(xpath = "//div[@class = 'aoD az6']/input[(@class = 'aoT') and (@name = 'subjectbox')]")
	private WebElement inputTheme;

	@FindBy(xpath = "//div[@class = 'Am Al editable LW-avf']")
	private WebElement inputBody;

	@FindBy(xpath = "//div[text()='Send']")
	private WebElement buttonSend;

	public NewEmailPopup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void sendEmail(String username) {
		buttonNewLetter.click();
		inputRecipientEmail.sendKeys(username);
		inputTheme.sendKeys("Spam");
		inputBody.sendKeys("Some text in the email.");
		buttonSend.click();
		final Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[(@class = 'vh')]//span[@class = 'ag a8k']"))));
	}
}