package com.epam.cdp.volha_ivanova.task1.readWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.epam.cdp.volha_ivanova.task1.candies.AbstractCandy;
import com.epam.cdp.volha_ivanova.task1.candies.Chocolate;
import com.epam.cdp.volha_ivanova.task1.candies.ChocolateCandies;
import com.epam.cdp.volha_ivanova.task1.candies.Lollipop;
import com.epam.cdp.volha_ivanova.task1.candies.Waffle;
import com.epam.cdp.volha_ivanova.task1.exceptions.IllegalCandyException;
import com.epam.cdp.volha_ivanova.task1.gift.Gift;

public class ReadFile {
	/**
	 * @autor Volha_Ivanova. Implements methods for reading from file.
	 */
	public static void readCandyFromFile(String fileName, Gift gift) {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line = reader.readLine();
			while (line != null) {
				gift.add(getCandy(line));
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (IllegalCandyException e) {
			throw new IllegalArgumentException(e);
		}
	}

	private static AbstractCandy getCandy(String row) {
		String[] params = row.split(" ");
		String name = params[0].trim();
		try {
			Integer weight = Integer.parseInt(params[1]);
			Integer price = Integer.parseInt(params[2]);
			switch (name) {
			case ("Chocolate"):
				return new Chocolate(name, weight, price);
			case ("ChocolateCandy"):
				return new ChocolateCandies(name, weight, price);
			case ("Lollipop"):
				return new Lollipop(name, weight, price);
			case ("Waffle"):
				return new Waffle(name, weight, price);
			default:
				throw new IllegalArgumentException("Unknown candy name in file!");
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Weight and price should be integer!");
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException("Invalid candies parameters in file!");
		}
	}
}
