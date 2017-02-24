package com.epam.cdp.volha_ivanova.task1.test;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener implements ISuiteListener {
	/**
	 * @autor Volha_Ivanova
	 * Implements custom listener for suites.
	 */
	@Override
	public void onStart(ISuite suite) {
		System.out.println("Suite started: " + suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Suite completed: " + suite.getName());
	}

}
