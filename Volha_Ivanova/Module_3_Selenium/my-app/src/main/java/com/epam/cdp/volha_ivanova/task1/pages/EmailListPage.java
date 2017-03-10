package com.epam.cdp.volha_ivanova.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailListPage {
	/**
	 * @author Volha_Ivanova 
	 * All methods on the emailListPage.
	 */
	private final WebDriver driver;

	@FindBy(xpath = "//a[@class='WaidBe']")
	private WebElement buttonGmail;

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
	private WebElement buttonNewLetter;

	@FindBy(xpath = "//textarea[(@class = 'vO') and (@name='to')]")
	private WebElement inputRecipientEmail;

	@FindBy(xpath = "//div[@class = 'aoD az6']/input[(@class = 'aoT') and (@name = 'subjectbox')]")
	private WebElement inputTheme;

	@FindBy(xpath = "//div[@class = 'Am Al editable LW-avf']")
	private WebElement inputBody;

	@FindBy(xpath = "//*[@data-tooltip='Отправить ‪(⌘Enter)‬']")
	private WebElement buttonSend;

	@FindBy(xpath = "//span[@email = 'user1selenium@gmail.com']")
	private WebElement findLetter;

	@FindBy(xpath = "//*[@id=':5']/div[2]/div[1]/div/div[2]/div[2]")
	private WebElement markAsSpam;

	@FindBy(xpath = "//div[@class = 'Kj-JD-Jl']//button[@name = 'rs']")
	private WebElement buttonInSpam;

	@FindBy(xpath = "//span[@class = 'CJ']")
	private WebElement buttonExpand;

	@FindBy(xpath = "//a[@title = 'Спам']")
	private WebElement buttonSpam;

	@FindBy(xpath = "//a[@class = 'gb_b gb_eb gb_R']//span[@class = 'gb_9a gbii']")
	private WebElement buttonAccount;

	@FindBy(xpath = "//a[@class = 'gb_Ha gb_3e gb_af gb_yb']")
	private WebElement buttonLogOut;

	@FindBy(xpath = "//a[@id = 'account-chooser-link']")
	private WebElement buttonDifferentUser;

	@FindBy(xpath = "//a[@id = 'account-chooser-add-account']")
	private WebElement buttonAddAccount;

	public EmailListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public SignInPage openEmailList() {
		buttonGmail.click();
		return new SignInPage(driver);
	}
	public void sendEmail(String username) {
		buttonNewLetter.click();
		inputRecipientEmail.sendKeys(username);
		inputTheme.sendKeys("Spam");
		inputBody.sendKeys("Some text in the email.");
		buttonSend.click();
	}
	public void markEmailAsSpam() {
		findLetter.click();
		markAsSpam.click();
		buttonInSpam.click();
	}
	public void findEmail() {
		buttonExpand.click();
		buttonSpam.click();
	}
	public void logOut() {
		buttonAccount.click();
		buttonLogOut.click();
		buttonDifferentUser.click();
		buttonAddAccount.click();
	}
	public void logOutAll() {
		buttonAccount.click();
		buttonLogOut.click();
		buttonAddAccount.click();
	}
}