package com.epam.cdp.volha_ivanova.task1.readWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FilesOperations {
	/**
	 * @autor Volha_Ivanova. Implements methods for reading and writing to file.
	 */
	public static void write(String fileName, String text) throws IOException {

		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
			PrintWriter out = new PrintWriter(file.getAbsoluteFile());
			out.print(text);
			out.close();
		} else {
			StringBuilder sb = new StringBuilder();
			String oldFile = read(fileName);
			sb.append(oldFile);
			sb.append(text);
			PrintWriter out = new PrintWriter(file.getAbsoluteFile());
			out.print(sb.toString());
			out.close();
		}
	}

	public static String read(String fileName) throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
		File file = new File(fileName);

		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append(System.lineSeparator());
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sb.toString();
	}

	public static void delete(String fileName) throws FileNotFoundException {
		new File(fileName).delete();
	}
}
