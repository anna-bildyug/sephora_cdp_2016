package com.epam.cdp.volha_ivanova.task1.test;

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
		testNG.addListener(new CustomListener());
		
		XmlSuite xmlSuitePositive = new XmlSuite();
		xmlSuitePositive.setName("Calculator Positive Tests suite");
		xmlSuitePositive.setSuiteFiles(
				new ArrayList<String>() {{
			add("./src/com/epam/cdp/volha_ivanova/task1/suites/calculatorPositiveTests.xml");
		}});
		XmlSuite xmlSuiteNegative = new XmlSuite();
		xmlSuiteNegative.setName("Calculator Positive Tests suite");
		xmlSuiteNegative.setSuiteFiles(
				new ArrayList<String>() {{
			add("./src/com/epam/cdp/volha_ivanova/task1/suites/calculatorNegativeTests.xml");
		}});
		testNG.setXmlSuites(new ArrayList<XmlSuite>() {{
	add(xmlSuitePositive);
	add(xmlSuiteNegative);
}});
		testNG.run();
	}
}
