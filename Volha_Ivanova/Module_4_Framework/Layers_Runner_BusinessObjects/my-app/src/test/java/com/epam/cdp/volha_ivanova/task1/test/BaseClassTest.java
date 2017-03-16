package com.epam.cdp.volha_ivanova.task1.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

@Test
public class BaseClassTest {
	/**
	 * @autor Volha_Ivanova
	 */
	protected WebDriver driver;
	private final static Logger logger = Logger.getLogger(BaseClassTest.class);

	@BeforeClass(description = "Open browser")
    public void openBrowser(){    	 
    	 System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chrome/chromedriver");
 		driver = new ChromeDriver();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		logger.info("Browser started"); 	
    }

    @AfterClass(alwaysRun = true, description = "Stop Browser")
    public void stopBrowser() {
    	driver.quit();
        logger.info("Browser closed");
    }
}
