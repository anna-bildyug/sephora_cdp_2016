package com.epam.cdp.chef.iofiles;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.epam.cdp.chef.salad.Salad;

public class VegetablesWriter {

	public static void writeVegetables(String fileName, Salad salad) {
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter(fileName))) {
			writer.write("Ingredients added to salad: "
					+ salad.getIngredients().toString());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
