package com.epam.cdp.chef.runner;

import com.epam.cdp.chef.interfaces.ICalculateCalories;
import com.epam.cdp.chef.salad.Salad;
import com.epam.cdp.chef.vegetables.Cucumber;
import com.epam.cdp.chef.vegetables.Onion;
import com.epam.cdp.chef.vegetables.Tomato;
import com.epam.cdp.chef.vegetables.Vegetable;

public class Runner {

	private static void printCalories(ICalculateCalories calculatable) {
		System.out.println(calculatable.calculateFullCalories());
	}

	public static void main(String[] args) {
		Vegetable veg1 = new Tomato(300);
		Vegetable veg2 = new Onion(50);
		Vegetable veg3 = new Cucumber(250);

		Salad summerSalad = new Salad();
		summerSalad.add(veg1);
		summerSalad.add(veg2);
		summerSalad.add(veg3);

		for (Vegetable veg : summerSalad.getIngredients()) {
			System.out.print(veg.getName() + " full calories: ");
			printCalories(veg);
		}
		System.out.print("Salad full calories: ");
		printCalories(summerSalad);

		System.out.println("Ingridients added to salad: "
				+ summerSalad.getIngredients().toString());

		System.out.println("Search by name 'Onion': "
				+ summerSalad.find("Onion"));
		System.out.println("Search by full calories value '300': "
				+ summerSalad.find(300));

		summerSalad.sortByName();
		System.out.println("Salad ingridients sorted by name: "
				+ summerSalad.getIngredients().toString());
	}

}
