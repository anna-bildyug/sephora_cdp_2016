package com.epam.cdp.volha_ivanova.task1.loggerDecorator;

public class XMLLogger extends LoggerDecorator {
	public XMLLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void log(String msg) {
		logger.log(msg);
		System.out.println("<?xml version=&quot;1.0&quot;?><message>XML Logger" + msg);
	}
}
