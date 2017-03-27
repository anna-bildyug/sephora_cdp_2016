package com.epam.cdp.volha_ivanova.task1.logger;

public class HTMLLoggerDecorator extends BasicLogger {
	Logger logger;
	public HTMLLoggerDecorator(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void log(String msg) {
		logger.log(msg);
		System.out.println("<HTML> HTML Logger" + msg);
	}
}
