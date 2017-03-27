package com.epam.gmail.test.module.toolbar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.gmail.test.driver.WebDriverSingleton;
import com.epam.gmail.test.util.DriverUtil;

public class MainToolbar {
	private static final Logger logger = LogManager.getLogger(MainToolbar.class);

	@FindBy(xpath = "//div[@gh=\"mtb\"]//div[@title=\"Report spam\" or @data-tooltip=\"Report spam\"]")
	private WebElement reportSpamButton;

	private final String spamButtonXpath = "//div[@role=\"alertdialog\"]/div/button[2]";

	private final String alertXpath = "//div[@role=\"alert\"]";

	public MainToolbar() {
		PageFactory.initElements(WebDriverSingleton.getWebDriverInstance(), this);
	}

	public void moveToSpam(String subject) {
		DriverUtil.waitForElementToBeClickable(By.xpath("//*[text()=\"" + subject + "\"]")).click();
		
		DriverUtil.waitForElementToBeClickable(reportSpamButton).click();
		
		WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getWebDriverInstance(), 40);
	    wait.until(
	    		ExpectedConditions.or(
	    				ExpectedConditions.visibilityOfElementLocated(By.xpath(spamButtonXpath)),
	    				ExpectedConditions.visibilityOfElementLocated(By.xpath(alertXpath))
	    				)
	    		);
	    logger.info("Emails marked as SPAM via Tolbar button");

	    if(WebDriverSingleton.getWebDriverInstance().findElements(By.xpath(spamButtonXpath)).size() > 0) {
	    	WebDriverSingleton.getWebDriverInstance().findElement(By.xpath(spamButtonXpath)).click();
	    	DriverUtil.waitForVisibilityOf(By.xpath(alertXpath));
	    	logger.info("Emails marked as SPAM through Modal");
	    }
	}
	
}
