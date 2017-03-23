package com.epam.cdp.volha_ivanova.task1.test.runner;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.epam.cdp.volha_ivanova.task1.fileHandlerFactory.FileHandler;
import com.epam.cdp.volha_ivanova.task1.fileHandlerFactory.FileManager;
import com.epam.cdp.volha_ivanova.task1.loggerDecorator.BasicLogger;
import com.epam.cdp.volha_ivanova.task1.loggerDecorator.HTMLLogger;
import com.epam.cdp.volha_ivanova.task1.loggerDecorator.Logger;
import com.epam.cdp.volha_ivanova.task1.loggerDecorator.XMLLogger;

public class Runner {
	/**
	 * @throws IOException
	 * @autor Volha_Ivanova
	 */
	@SuppressWarnings({ "deprecation", "serial" })
	public static void main(String[] args) throws IOException {
		TestNG testNG = new TestNG();
		testNG.addListener(new TestListenerAdapter());

		BasicLogger logger = new BasicLogger();
		Logger htmlLogger = new HTMLLogger(new BasicLogger());
		Logger xmlAndHtmlLogger = new XMLLogger(new BasicLogger());
		logger.log("Basic Logger log");
		htmlLogger.log("HTML Logging");
		xmlAndHtmlLogger.log("I am Both HTML and XML logging");

		final XmlSuite xmlSuiteGmail = new XmlSuite();
		xmlSuiteGmail.setName("Test Gmail");
		xmlSuiteGmail.setSuiteFiles(new ArrayList<String>() {
			{
				add("./src/test/java/com/epam/cdp/volha_ivanova/task1/resources/TestSuite.xml");
			}
		});
		testNG.setXmlSuites(new ArrayList<XmlSuite>() {
			{
				add(xmlSuiteGmail);
			}
		});
		testNG.run();

		FileManager results = new FileManager();
		FileHandler file = results.getFileHandler("TXT");
		file.writeToFile();
	}
}
