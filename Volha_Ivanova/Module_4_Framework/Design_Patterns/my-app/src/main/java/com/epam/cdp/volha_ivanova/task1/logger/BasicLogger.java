package com.epam.cdp.volha_ivanova.task1.logger;

public class BasicLogger implements Logger {

	public void log(String msg) {
		System.out.println("BasicLogger: " + msg);
	}
}
