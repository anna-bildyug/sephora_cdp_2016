package com.epam.cdp.volha_ivanova.task1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailListPage {
	/**
	 * @author Volha_Ivanova
	 */
	protected WebDriver driver;

	@FindBy(xpath = "//a[@class='WaidBe']")
	private WebElement buttonGmail;

	@FindBy(xpath = "//span[@email = 'user1selenium@gmail.com']")
	private WebElement findLetter;

	@FindBy(xpath = "//*[@id=':5']/div[2]/div[1]/div/div[2]/div[2]")
	private WebElement markAsSpam;

	@FindBy(xpath = "//div[@class = 'Kj-JD-Jl']//button[@name = 'rs']")
	private WebElement buttonInSpam;

	@FindBy(xpath = "//div[@class='n6']//span[text()='More']")
	private WebElement buttonExpand;

	@FindBy(xpath = "//div[@class='TK']//a[@href='https://mail.google.com/mail/u/0/#spam' and @title = 'Spam']")
	private WebElement buttonSpam;

	public EmailListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SignInPage openEmailList() {
		buttonGmail.click();
		return new SignInPage(driver);
	}

	public void markEmailAsSpam() {
		findLetter.click();
		markAsSpam.click();
		buttonInSpam.click();
		final Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[(@class = 'vh')]/span[@class = 'bofITb']"))));
	}

	public void findEmail() {
		buttonExpand.click();
		buttonSpam.click();
	}
}