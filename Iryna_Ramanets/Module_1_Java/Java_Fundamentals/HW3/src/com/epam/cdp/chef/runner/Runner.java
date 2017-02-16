package com.epam.cdp.chef.runner;

import com.epam.cdp.chef.exceptions.EmptySaladException;
import com.epam.cdp.chef.exceptions.VegetableNotFoundException;
import com.epam.cdp.chef.interfaces.ICaloriesCalculatable;
import com.epam.cdp.chef.iofiles.VegetablesReader;
import com.epam.cdp.chef.iofiles.VegetablesWriter;
import com.epam.cdp.chef.salad.Salad;
import com.epam.cdp.chef.vegetables.Vegetable;

public class Runner {
	

	public static void main(String[] args) {
		Salad summerSalad = new Salad();

		VegetablesReader.readVegetables("iofiles/input.txt", summerSalad);
		
		VegetablesWriter.writeVegetables("iofiles/output.txt", summerSalad);

		for (Vegetable veg : summerSalad.getIngredients()) {
			printCalories(veg.getName() + " full calories: ", veg);
		}
		printCalories("Salad full calories: ", summerSalad);

		try {
			System.out.println("Search by name 'Onion2': "
					+ summerSalad.findByName("Onion2"));
		} catch (VegetableNotFoundException e) {
			System.out.println("Vegetable does not found by name!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Search by full calories value '300': "
					+ summerSalad.findByCalories(300));
		} catch (VegetableNotFoundException e) {
			System.out.println("Vegetable does not found by calories!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			summerSalad.sortByName();
		} catch (EmptySaladException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Salad ingredients sorted by name: "
				+ summerSalad.getIngredients().toString());
	}

	private static void printCalories(String msg, ICaloriesCalculatable calculatable) {
		System.out.println(msg + calculatable.calculateFullCalories());
	}
}
