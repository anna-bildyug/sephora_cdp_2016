package com.epam.cdp.chef.iofiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.epam.cdp.chef.exceptions.IllegalVegetableException;
import com.epam.cdp.chef.salad.Salad;
import com.epam.cdp.chef.vegetables.Cucumber;
import com.epam.cdp.chef.vegetables.Onion;
import com.epam.cdp.chef.vegetables.Tomato;

public class VegetablesReader {

	public static void readVegetables(String fileName, Salad salad) {
		String data = "";
		try (BufferedReader reader = new BufferedReader(
				new FileReader(fileName))) {
			StringBuilder sb = new StringBuilder();
			String line = reader.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = reader.readLine();
			}
			data = sb.toString();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		String[] rows = data.split("\n");
		for (String row : rows) {
			String[] params = row.split(",");
			String name = params[0].trim();
			try {
				float weight = Float.parseFloat(params[1]);
				switch (name) {
				case ("Tomato"):
					salad.add(new Tomato(weight));
					break;
				case ("Onion"):
					salad.add(new Onion(weight));
					break;
				case ("Cucumber"):
					salad.add(new Cucumber(weight));
					break;
				default:
					throw new IllegalArgumentException(
							"Unknown vegitable in file!");
				}
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Weight should be float!");
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new IllegalArgumentException(
						"Invalid vegetable parameters in file!");
			} catch (IllegalVegetableException e) {
				throw new IllegalArgumentException(e);
			}
		}
	}

}
