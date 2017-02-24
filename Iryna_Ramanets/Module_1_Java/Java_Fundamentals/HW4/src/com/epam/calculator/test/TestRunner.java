package com.epam.calculator.test;

import java.util.ArrayList;

import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class TestRunner {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		testNG.addListener((ITestNGListener) new CustomTestListenerAdapter());

		XmlSuite xmlSuitePositive = new XmlSuite();
		xmlSuitePositive.setName("Calculator Tests suite parallel");
		xmlSuitePositive.setSuiteFiles(new ArrayList<String>() {
			{
				add("./files/calculator_parallel.xml");
			}
		});
		testNG.setXmlSuites(new ArrayList<XmlSuite>() {
			{
				add(xmlSuitePositive);
			}
		});
		testNG.run();
	}
}
