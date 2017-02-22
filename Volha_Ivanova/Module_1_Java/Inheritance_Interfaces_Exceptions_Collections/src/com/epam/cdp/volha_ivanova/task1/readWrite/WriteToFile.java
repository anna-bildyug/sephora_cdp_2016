package com.epam.cdp.volha_ivanova.task1.readWrite;

import java.io.*;

import com.epam.cdp.volha_ivanova.task1.gift.Gift;

public class WriteToFile {
	/**
	 * @autor Volha_Ivanova. Implements methods for writing to file.
	 */
	public static void writeCandyToFile(String fileName, Gift gift) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName)))) {
			writer.write("Candies in the present: " + gift.getGiftComposition());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
