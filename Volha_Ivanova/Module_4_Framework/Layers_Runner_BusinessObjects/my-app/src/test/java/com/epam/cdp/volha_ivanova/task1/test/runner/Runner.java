package com.epam.cdp.volha_ivanova.task1.test.runner;

import java.util.ArrayList;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class Runner {
	/**
	 * @autor Volha_Ivanova
	 */	
	@SuppressWarnings({ "deprecation", "serial" })
	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		testNG.addListener(new TestListenerAdapter());			
		
		final XmlSuite xmlSuiteGmail = new XmlSuite();
		xmlSuiteGmail.setName("Test Gmail");
		xmlSuiteGmail.setSuiteFiles(
				new ArrayList<String>() {{
			add("./src/test/java/com/epam/cdp/volha_ivanova/task1/resources/TestSuite.xml");
		}});
		testNG.setXmlSuites(new ArrayList<XmlSuite>() {{
	add(xmlSuiteGmail);	
}});
		testNG.run();
	}
}
