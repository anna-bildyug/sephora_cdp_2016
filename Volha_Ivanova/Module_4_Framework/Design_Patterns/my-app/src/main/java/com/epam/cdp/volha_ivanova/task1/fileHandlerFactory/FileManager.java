package com.epam.cdp.volha_ivanova.task1.fileHandlerFactory;

public class FileManager {
	public FileHandler getFileHandler(String type) {
		
		if ("TXT".equals(type)) {
			return new TextFileHandler();
		} else if ("XML".equals(type)) {
			return new XMLFileHandler();
		}
		return null;
	}
}
