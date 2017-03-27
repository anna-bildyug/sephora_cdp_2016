package com.epam.cdp.volha_ivanova.task1.fileHandler;

public class FileManagerFactory {

	public FileHandler getFileHandler(FileType type) {

		if (type == FileType.TXT) {
			return new TextFileHandler();
		} else if (type == FileType.XML) {
			return new XMLFileHandler();
		}
		throw new IllegalArgumentException("Incorrect type of file!");
	}
}
