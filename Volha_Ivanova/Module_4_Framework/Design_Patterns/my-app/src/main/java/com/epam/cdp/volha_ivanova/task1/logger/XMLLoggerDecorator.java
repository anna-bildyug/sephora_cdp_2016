package com.epam.cdp.volha_ivanova.task1.logger;

public class XMLLoggerDecorator extends BasicLogger {
	Logger logger;

	public XMLLoggerDecorator(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void log(String msg) {
		logger.log(msg);
		System.out.println("<?xml version=&quot;1.0&quot;?><message>XML Logger" + msg);
	}
}
