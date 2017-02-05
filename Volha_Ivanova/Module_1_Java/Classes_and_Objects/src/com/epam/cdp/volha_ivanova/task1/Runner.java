package com.epam.cdp.volha_ivanova.task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Runner {
	/**
	 * @author Volha_Ivanova Implements calculating weight of the present
	 *         according to number of sweets that enter user. Sort sweets
	 *         according to number in the present. Find sweet weight by its
	 *         name.
	 */
	private static int presentWeight;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many waffles do you want to add to the present?");
		int countOfWaffles = scanner.nextInt();
		System.out.println("How many white chocolates do you want to add to the present?");
		int countOfChocoWhite = scanner.nextInt();
		System.out.println("How many dark chocolates do you want to add to the present?");
		int countOfChocoDark = scanner.nextInt();
		System.out.println("How many milk chocolates do you want to add to the present?");
		int countOfChocoMilk = scanner.nextInt();
		System.out.println("How many chocolate candies do you want to add to the present?");
		int countOfChocoCandies = scanner.nextInt();
		System.out.println("How many lollipops do you want to add to the present?");
		int countOfLollipops = scanner.nextInt();
		Waffles waffle = new Waffles("Waffles", 10, countOfWaffles);
		Chocolate chocolate1 = new Chocolate("White chocolate", "white", 100, countOfChocoWhite);
		Chocolate chocolate2 = new Chocolate("Dark chocolate", "dark", 100, countOfChocoDark);
		Chocolate chocolate3 = new Chocolate("Milk chocolate", "Milk", 100, countOfChocoMilk);
		ChocolateCandies chocoCandy = new ChocolateCandies("Chocolate candies", 30, countOfChocoCandies);
		Lollipop lollipop = new Lollipop("Lollipop", 20, countOfLollipops);
		presentWeight += waffle.addToPresent() + chocolate1.addToPresent() + chocolate2.addToPresent()
				+ chocolate3.addToPresent() + chocoCandy.addToPresent() + lollipop.addToPresent();
		System.out.println("Weight of the present is " + presentWeight + " gramm");
		HashMap<Integer, String> sweetsSort = new HashMap<Integer, String>();
		sweetsSort.put(waffle.getWaffleCount(), waffle.getName());
		sweetsSort.put(chocolate1.getChocolateCount(), chocolate1.getName());
		sweetsSort.put(chocolate2.getChocolateCount(), chocolate2.getName());
		sweetsSort.put(chocolate3.getChocolateCount(), chocolate3.getName());
		sweetsSort.put(chocoCandy.getChocoCandiesCount(), chocoCandy.getName());
		sweetsSort.put(lollipop.getLollipopCount(), lollipop.getName());
		Set set = sweetsSort.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry e = (Map.Entry) iterator.next();
			System.out.println("Number of sweets " + e.getKey() + " Sweet name is " + e.getValue());
		}
		HashMap<Integer, String> sweetsFind = new HashMap<Integer, String>();
		sweetsFind.put(waffle.getWeight(), waffle.getName());
		sweetsFind.put(chocolate1.getWeight(), chocolate1.getName());
		sweetsFind.put(chocolate2.getWeight(), chocolate2.getName());
		sweetsFind.put(chocolate3.getWeight(), chocolate3.getName());
		sweetsFind.put(chocoCandy.getWeight(), chocoCandy.getName());
		sweetsFind.put(lollipop.getWeight(), lollipop.getName());
		System.out.println("Enter name of sweet that weigh you want to know");
		String nameOfSweet = scanner.next();
		Set set1 = sweetsFind.entrySet();
		Iterator iterator1 = set1.iterator();
		while (iterator1.hasNext()) {
			Map.Entry e = (Map.Entry) iterator1.next();
			if (nameOfSweet.equals(nameOfSweet)) {
				System.out.println("Sweet with name " + nameOfSweet + " weights " + e.getKey());
			}
			break;
		}
	}
}
