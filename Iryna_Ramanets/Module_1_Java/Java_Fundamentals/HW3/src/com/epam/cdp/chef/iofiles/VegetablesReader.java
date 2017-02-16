package com.epam.cdp.chef.iofiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.epam.cdp.chef.exceptions.IllegalVegetableException;
import com.epam.cdp.chef.salad.Salad;
import com.epam.cdp.chef.vegetables.Cucumber;
import com.epam.cdp.chef.vegetables.Onion;
import com.epam.cdp.chef.vegetables.Tomato;
import com.epam.cdp.chef.vegetables.Vegetable;

public class VegetablesReader {

	public static void readVegetables(String fileName, Salad salad) {
		try (BufferedReader reader = new BufferedReader(
				new FileReader(fileName))) {
			String line = reader.readLine();

			while (line != null) {
				salad.add(getVegetable(line));
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (IllegalVegetableException e) {
			throw new IllegalArgumentException(e);
		}

	}

	private static Vegetable getVegetable(String row) {
		String[] params = row.split(",");
		String name = params[0].trim();
		try {
			float weight = Float.parseFloat(params[1]);
			switch (name) {
			case ("Tomato"):
				return new Tomato(weight);
			case ("Onion"):
				return new Onion(weight);
			case ("Cucumber"):
				return new Cucumber(weight);
			default:
				throw new IllegalArgumentException("Unknown vegitable in file!");
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Weight should be float!");
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException(
					"Invalid vegetable parameters in file!");
		}

	}
}
