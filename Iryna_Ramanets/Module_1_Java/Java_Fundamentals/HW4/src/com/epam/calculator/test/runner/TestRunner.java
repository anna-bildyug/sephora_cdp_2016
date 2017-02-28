package com.epam.calculator.test.runner;

import java.util.ArrayList;

import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.epam.calculator.test.listener.CustomTestListenerAdapter;

public class TestRunner {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		testNG.addListener((ITestNGListener) new CustomTestListenerAdapter());

		XmlSuite xmlSuiteParallel = new XmlSuite();
		xmlSuiteParallel.setName("Calculator Tests suite parallel");
		xmlSuiteParallel.setSuiteFiles(new ArrayList<String>() {
			{
				add("./files/calculator_parallel.xml");
			}
		});

		XmlSuite xmlSuite = new XmlSuite();
		xmlSuite.setName("Calculator Tests suite");
		xmlSuite.setSuiteFiles(new ArrayList<String>() {
			{
				add("./files/calculator.xml");
			}
		});

		testNG.setXmlSuites(new ArrayList<XmlSuite>() {
			{
				add(xmlSuiteParallel);
				add(xmlSuite);
			}
		});
		testNG.run();
	}
}
