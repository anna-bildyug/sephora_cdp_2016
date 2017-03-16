package com.epam.gmail.test.module.toolbar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainToolbar {
	private static final Logger logger = LogManager.getLogger(MainToolbar.class);

	@FindBy(xpath = "//div[@gh=\"mtb\"]//div[@title=\"Report spam\" or @data-tooltip=\"Report spam\"]")
	private WebElement reportSpamButton;

	private final String spamButtonXpath = "//div[@role=\"alertdialog\"]/div/button[2]";

	private final String alertXpath = "//div[@role=\"alert\"]";

	public MainToolbar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void moveToSpam(WebDriver driver, String subject) {
		WebDriverWait wait = new WebDriverWait(driver, 40);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"" + subject + "\"]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(reportSpamButton)).click();
		
	    wait.until(
	    		ExpectedConditions.or(
	    				ExpectedConditions.visibilityOfElementLocated(By.xpath(spamButtonXpath)),
	    				ExpectedConditions.visibilityOfElementLocated(By.xpath(alertXpath))
	    				)
	    		);
	    logger.info("Emails marked as SPAM via Tolbar button");

	    if(driver.findElements(By.xpath(spamButtonXpath)).size() > 0) {
	    	driver.findElement(By.xpath(spamButtonXpath)).click();
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(alertXpath)));
	    	logger.info("Emails marked as SPAM through Modal");
	    }
	}
	
}
