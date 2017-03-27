package com.epam.cdp.volha_ivanova.task1.fileHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileHandler implements FileHandler {

	private PrintWriter out = null;

	public void writeToFile() throws IOException {

		out = new PrintWriter(
				new FileWriter("./src/test/java/com/epam/cdp/volha_ivanova/task1/test/results/output.txt"));
		out.write("The Gmail test is successfully passed!!");
		out.close();
	}
}
