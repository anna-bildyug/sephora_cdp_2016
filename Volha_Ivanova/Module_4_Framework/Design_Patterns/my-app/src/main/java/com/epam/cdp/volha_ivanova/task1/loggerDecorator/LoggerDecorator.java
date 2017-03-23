package com.epam.cdp.volha_ivanova.task1.loggerDecorator;

public class LoggerDecorator implements Logger {
	Logger logger;

	public LoggerDecorator(Logger logger) {
		this.logger = logger;
	}

	public void log(String msg) {
		logger.log(msg);
	}
}
