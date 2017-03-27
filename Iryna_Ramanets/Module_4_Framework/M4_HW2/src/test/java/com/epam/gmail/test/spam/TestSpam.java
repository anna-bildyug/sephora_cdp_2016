package com.epam.gmail.test.spam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.gmail.test.driver.FirefoxDriverCreator;
import com.epam.gmail.test.driver.WebDriverSingleton;
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
	
	@BeforeClass
	public void beforeClass() {
		WebDriverSingleton.setCreator(new FirefoxDriverCreator());
	}
	
	@AfterClass
	public void afterClass() {
		WebDriverSingleton.getWebDriverInstance().close();
	}
	
	@Test
	public void testSpam() {
		// Launch the Gmail WebSite
		WebDriverSingleton.getWebDriverInstance().get(URL);

		// Sign in user1
		SighInPage signInPage = new SighInPage();
		signInPage.userSignIn(USER1, PSWD);

		// Write first email
		WriteEmailDialog writeEmailDialog = new WriteEmailDialog();
		String subject = "Email for spam";
		writeEmailDialog.writeEmail(USER2, subject);

		// reopen browser
		DriverUtil.reopenBrowser(URL);

		// Sign in user2
		signInPage = new SighInPage();
		signInPage.userSignIn(USER2, PSWD);

		// Move email to Spam
		MainToolbar markAsSpam = new MainToolbar();
		markAsSpam.moveToSpam(subject);

		// reopen browser
		DriverUtil.reopenBrowser(URL);

		// Sign in user1
		signInPage = new SighInPage();
		signInPage.userSignIn(USER1, PSWD);

		// Write second email
		writeEmailDialog = new WriteEmailDialog();
		writeEmailDialog.writeEmail(USER2, subject);

		//reopen browser
		DriverUtil.reopenBrowser(URL);

		// Sign in user2
		signInPage = new SighInPage();
		signInPage.userSignIn(USER2, PSWD);

		// Verify email in Spam
		SpamPage emailInSpam = new SpamPage();
		emailInSpam.verifyEmailInSpam(subject);
	}
}