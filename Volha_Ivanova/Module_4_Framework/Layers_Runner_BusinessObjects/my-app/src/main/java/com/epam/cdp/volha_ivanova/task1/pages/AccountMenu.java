package com.epam.cdp.volha_ivanova.task1.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountMenu {
	/**
	 * @author Volha_Ivanova
	 */
	private WebDriver driver;

	@FindBy(xpath = "//a[@class = 'gb_b gb_eb gb_R']//span[@class = 'gb_9a gbii']")
	private WebElement buttonAccount;

	@FindBy(xpath = "//a[@class = 'gb_Ha gb_3e gb_af gb_yb']")
	private WebElement buttonLogOut;

	@FindBy(xpath = "//a[@id = 'account-chooser-link']")
	private WebElement buttonDifferentUser;

	@FindBy(xpath = "//a[@id = 'account-chooser-add-account']")
	private WebElement buttonAddAccount;

	public AccountMenu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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

	public void logOutAllAvoidAlert() {
		try {
			logOutAll();
		} catch (UnhandledAlertException f) {
			try {
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
				System.out.println("Alert data: " + alertText);
				alert.accept();
				driver.findElement(By.xpath("//a[@id = 'account-chooser-add-account']")).click();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}
	}
}
