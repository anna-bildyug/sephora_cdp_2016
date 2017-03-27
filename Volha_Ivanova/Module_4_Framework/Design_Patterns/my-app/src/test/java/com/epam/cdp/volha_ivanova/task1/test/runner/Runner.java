package com.epam.cdp.volha_ivanova.task1.test.runner;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import com.epam.cdp.volha_ivanova.task1.fileHandler.FileHandler;
import com.epam.cdp.volha_ivanova.task1.fileHandler.FileManagerFactory;
import com.epam.cdp.volha_ivanova.task1.fileHandler.FileType;
import com.epam.cdp.volha_ivanova.task1.logger.BasicLogger;
import com.epam.cdp.volha_ivanova.task1.logger.HTMLLoggerDecorator;
import com.epam.cdp.volha_ivanova.task1.logger.Logger;
import com.epam.cdp.volha_ivanova.task1.logger.XMLLoggerDecorator;

public class Runner {

	/**
	 * @param <TypeOfFile>
	 * @param <TypeOfFile>
	 * @throws IOException
	 * @autor Volha_Ivanova
	 */
	@SuppressWarnings({ "deprecation", "serial" })
	public static void main(String[] args) throws IOException {

		TestNG testNG = new TestNG();
		testNG.addListener(new TestListenerAdapter());

		BasicLogger logger = new BasicLogger();
		Logger htmlLogger = new HTMLLoggerDecorator(new BasicLogger());
		Logger xmlAndHtmlLogger = new XMLLoggerDecorator(new BasicLogger());
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

		FileManagerFactory results = new FileManagerFactory();
		FileHandler file = results.getFileHandler(FileType.TXT);
		file.writeToFile();
	}
}
