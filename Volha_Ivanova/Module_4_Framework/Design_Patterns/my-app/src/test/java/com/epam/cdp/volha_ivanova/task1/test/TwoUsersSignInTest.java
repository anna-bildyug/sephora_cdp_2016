package com.epam.cdp.volha_ivanova.task1.test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.cdp.volha_ivanova.task1.pages.EmailListPage;
import com.epam.cdp.volha_ivanova.task1.pages.SignInPage;
import com.epam.cdp.volha_ivanova.task1.pages.StartPage;
import com.epam.cdp.volha_ivanova.task1.pages.modules.AccountMenu;
import com.epam.cdp.volha_ivanova.task1.pages.modules.NewEmailPopup;

public class TwoUsersSignInTest extends BaseClassTest {
	/**
	 * @author Volha_Ivanova Browser Chrome 57.0.2987.98 MacOS.
	 * @throws IOException 
	 */
	@Parameters({ "firstUserEmail", "firstUserPassword", "secondUserEmail", "secondUserPassword" })
	@Test
	public void testSpamEmail(String firstUserEmail, String firstUserPassword, String secondUserEmail,
			String secondUserPassword) {
		StartPage startPage = new StartPage(driver);
		startPage.open();
		SignInPage signInPage = new SignInPage(driver);
		signInPage.signIn(firstUserEmail, firstUserPassword);
		EmailListPage emailListPage = new EmailListPage(driver);
		emailListPage.openEmailList();
		NewEmailPopup newEmail = new NewEmailPopup(driver);
		newEmail.sendEmail(secondUserEmail);
		AccountMenu accountMenu = new AccountMenu(driver);		
		accountMenu.logOut();
		signInPage.signIn(secondUserEmail, secondUserPassword);
		emailListPage.markEmailAsSpam();	
		accountMenu.logOutAllAvoidAlert();
		signInPage.signIn(firstUserEmail, firstUserPassword);
		newEmail.sendEmail(secondUserEmail);
		accountMenu.logOutAll();
		signInPage.signIn(secondUserEmail, secondUserPassword);
		emailListPage.findEmail();		
	}
}