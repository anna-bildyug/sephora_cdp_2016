package com.epam.gmail.test.spam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.gmail.test.module.dialog.WriteEmailDialog;
import com.epam.gmail.test.module.page.SighInPage;
import com.epam.gmail.test.module.page.SpamPage;
import com.epam.gmail.test.module.toolbar.MainToolbar;
import com.epam.gmail.test.util.DriverUtil;

public class TestSpam {

	private static final String URL = "http://gmail.com/";

	private static final String USER1 = "TestIrRam1@gmail.com";
	
	private static final String USER2 = "TestIrRam2@gmail.com";
	
	private static final String PSWD = "IR12345678";
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		if(System.getProperty("webdriver.chrome.driver") == null) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}
		driver = new ChromeDriver();
	}

	@Test
	public void testSpam() {
		// Launch the Gmail WebSite
		driver.get(URL);

		// Sign in user1
		SighInPage signInPage = new SighInPage(driver);
		signInPage.userSignIn(driver, USER1, PSWD);

		// Write first email
		WriteEmailDialog writeEmailDialog = new WriteEmailDialog(driver);
		String subject = "Email for spam";
		writeEmailDialog.writeEmail(driver, USER2, subject);

		// reopen browser
		driver = DriverUtil.reopenBrowser(driver, URL);

		// Sign in user2
		signInPage = new SighInPage(driver);
		signInPage.userSignIn(driver, USER2, PSWD);

		// Move email to Spam
		MainToolbar markAsSpam = new MainToolbar(driver);
		markAsSpam.moveToSpam(driver, subject);

		// reopen browser
		driver = DriverUtil.reopenBrowser(driver, URL);

		// Sign in user1
		signInPage = new SighInPage(driver);
		signInPage.userSignIn(driver, USER1, PSWD);

		// Write second email
		writeEmailDialog = new WriteEmailDialog(driver);
		writeEmailDialog.writeEmail(driver, USER2, subject);

		//reopen browser
		driver = DriverUtil.reopenBrowser(driver, URL);

		// Sign in user2
		signInPage = new SighInPage(driver);
		signInPage.userSignIn(driver, USER2, PSWD);

		// Verify email in Spam
		SpamPage emailInSpam = new SpamPage(driver);
		emailInSpam.verifyEmailInSpam(driver, subject);
	}

}