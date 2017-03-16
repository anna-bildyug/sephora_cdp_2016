package com.epam.cdp.volha_ivanova.task1.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.cdp.volha_ivanova.task1.pages.EmailListPage;
import com.epam.cdp.volha_ivanova.task1.pages.SignInPage;
import com.epam.cdp.volha_ivanova.task1.pages.StartPage;

public class TwoUsersSignInTest extends BaseClassTest{
	/**
	 * @author Volha_Ivanova Browser Chrome 57.0.2987.98 MacOS.
	 */	
	@Parameters({"First_user_email", "First_user_password", "Second_user_email", "Second_user_password" })
	@Test
	public void testOneCanLoginGithub(String First_user_email, String First_user_password, String Second_user_email, String Second_user_password) {
		/**
		 * Opens start page
		 */
		StartPage startPage = new StartPage(driver);
		startPage.open();
		SignInPage signInPage = new SignInPage(driver);
		/**
		 * Signing in with first user and sending email
		 */
		signInPage.signIn(First_user_email, First_user_password);
		EmailListPage emailListPage = new EmailListPage(driver);
		emailListPage.openEmailList();
		emailListPage.sendEmail(Second_user_email);
		/**
		 * Explicit wait with expected condition
		 */
		final Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[(@class = 'vh')]//span[@class = 'ag a8k']"))));		
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//a[@class = 'gb_b gb_eb gb_R']//span[@class = 'gb_9a gbii']"))));
		emailListPage.logOut();
		/**
		 * Signing in with second user and marking as spam
		 */
		signInPage.signIn(Second_user_email, Second_user_password);
		emailListPage.markEmailAsSpam();
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[(@class = 'vh')]/span[@class = 'bofITb']"))));
		
		try {
			emailListPage.logOutAll();
		} catch (UnhandledAlertException f) {
		    try {
		        Alert alert = driver.switchTo().alert();
		        String alertText = alert.getText();
		        System.out.println("Alert data: " + alertText);
		        alert.accept();
		        driver.findElement(By.xpath("//a[@id = 'account-chooser-add-account']")).click();;
		    } catch (NoAlertPresentException e) {
		        e.printStackTrace();
		    }
		}
		/**
		 * Signing in with first user and sending email
		 */
		signInPage.signIn(First_user_email, First_user_password);
		emailListPage.sendEmail(Second_user_email);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[(@class = 'vh')]//span[@class = 'ag a8k']"))));
		emailListPage.logOutAll();
		/**
		 * Signing in with second user and finding email in the spam folder
		 */
		signInPage.signIn(Second_user_email, Second_user_password);
		emailListPage.findEmail();		
	}
}