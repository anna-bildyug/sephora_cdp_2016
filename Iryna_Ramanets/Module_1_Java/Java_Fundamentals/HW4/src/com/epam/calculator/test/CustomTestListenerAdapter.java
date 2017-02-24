package com.epam.calculator.test;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomTestListenerAdapter implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod()) {
			System.out.println("Test " + method.getTestMethod().getMethodName()
					+ " started.");
		}
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod()) {
			System.out.println("Test " + method.getTestMethod().getMethodName()
					+ " finished.");
		}
	}

}
