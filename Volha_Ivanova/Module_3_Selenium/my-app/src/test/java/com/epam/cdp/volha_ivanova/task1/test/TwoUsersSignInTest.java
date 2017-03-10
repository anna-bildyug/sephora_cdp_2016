package com.epam.cdp.volha_ivanova.task1.test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.epam.cdp.volha_ivanova.task1.pages.EmailListPage;
import com.epam.cdp.volha_ivanova.task1.pages.SignInPage;
import com.epam.cdp.volha_ivanova.task1.pages.StartPage;

public class TwoUsersSignInTest {
	/**
	 * @author Volha_Ivanova Browser Chrome 57.0.2987.98 MacOS.
	 */
	private final String FIRSTUSEREMAIL = "user1selenium@gmail.com";
	private final String FIRSTPASSWORD = "AutomationT3ST";
	private final String SECONDUSEREMAIL = "user2selenium@gmail.com";
	private final String SECONDPASSWORD = "AutomationT3ST";

	@Test
	public void testOneCanLoginGithub() {
		System.setProperty("webdriver.chrome.driver", "src/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/**
		 * Opens start page
		 */
		StartPage startPage = new StartPage(driver);
		startPage.open();
		SignInPage signInPage = new SignInPage(driver);
		/**
		 * Signing in with first user and sending email
		 */
		signInPage.signIn(FIRSTUSEREMAIL, FIRSTPASSWORD);
		EmailListPage emailListPage = new EmailListPage(driver);
		emailListPage.openEmailList();
		emailListPage.sendEmail(SECONDUSEREMAIL);
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
		signInPage.signIn(SECONDUSEREMAIL, SECONDPASSWORD);
		emailListPage.markEmailAsSpam();
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[(@class = 'vh')]/span[@class = 'bofITb']"))));
		emailListPage.logOutAll();
		/**
		 * Signing in with first user and sending email
		 */
		signInPage.signIn(FIRSTUSEREMAIL, FIRSTPASSWORD);
		emailListPage.sendEmail(SECONDUSEREMAIL);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[(@class = 'vh')]//span[@class = 'ag a8k']"))));
		emailListPage.logOutAll();
		/**
		 * Signing in with second user and finding email in the spam folder
		 */
		signInPage.signIn(SECONDUSEREMAIL, SECONDPASSWORD);
		emailListPage.findEmail();

		driver.quit();
	}
}