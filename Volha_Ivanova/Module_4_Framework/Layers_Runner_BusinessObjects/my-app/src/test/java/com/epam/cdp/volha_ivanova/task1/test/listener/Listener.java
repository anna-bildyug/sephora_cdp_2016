package com.epam.cdp.volha_ivanova.task1.test.listener;

import org.testng.IInvokedMethod;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener, ISuiteListener {

	public void onStart(ISuite arg0) {
		Reporter.log("The Suite starts: " + arg0.getName(), true);
	}

	public void onFinish(ISuite arg0) {
		Reporter.log("The Suite finishes: " + arg0.getName(), true);
	}

	public void onStart(ITestContext arg0) {
		Reporter.log("The Test starts: " + arg0.getName(), true);
	}

	public void onFinish(ITestContext arg0) {
		Reporter.log("The test finishes:  " + arg0.getName(), true);
	}

	public void onTestSuccess(ITestResult arg0) {
	}

	public void onTestFailure(ITestResult arg0) {
	}

	public void onTestStart(ITestResult arg0) {		
	}

	public void onTestSkipped(ITestResult arg0) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
	}

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
	}
}
