package com.epam.cdp.volha_ivanova.task1.gift;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.epam.cdp.volha_ivanova.task1.candies.AbstractCandy;
import com.epam.cdp.volha_ivanova.task1.candies.Chocolate;
import com.epam.cdp.volha_ivanova.task1.candies.ChocolateCandies;
import com.epam.cdp.volha_ivanova.task1.candies.Lollipop;
import com.epam.cdp.volha_ivanova.task1.candies.Waffle;
import com.epam.cdp.volha_ivanova.task1.comparator.PriceComparator;
import com.epam.cdp.volha_ivanova.task1.exceptions.EmptyGiftException;
import com.epam.cdp.volha_ivanova.task1.exceptions.IllegalCandyException;
import com.epam.cdp.volha_ivanova.task1.exceptions.NotFoundException;
import com.epam.cdp.volha_ivanova.task1.readWrite.FilesOperations;

public class Gift extends FilesOperations {
	/**
	 * @autor Volha_Ivanova. Implements methods for completing the gift,
	 *        evaluating the gift weight, sorting sweets by price, searching
	 *        sweet within entered parameters.
	 */
	protected int gWeight = 0;
	AbstractCandy chocolate = new Chocolate("Chocolate", 100, 5);
	AbstractCandy chocoCandy = new ChocolateCandies("ChocolateCandy", 50, 3);
	AbstractCandy lollipop = new Lollipop("Lollipop", 20, 7);
	AbstractCandy waffle = new Waffle("Waffle", 30, 8);
	ArrayList<AbstractCandy> sweetGift = new ArrayList<AbstractCandy>();

	public List<AbstractCandy> getGiftComposition() {
		return sweetGift;
	}

	public void add(AbstractCandy candy) throws IllegalCandyException {
		if (candy.getName() == null || candy.getName().isEmpty()) {
			throw new IllegalCandyException("Incorrect name!");
		}
		if (candy.getWeight() <= 0) {
			throw new IllegalCandyException("Incorrect weight!");
		}
		if (candy.getPrice() <= 0) {
			throw new IllegalCandyException("Incorrect price!");
		}
		sweetGift.add(candy);
	}

	public void completeGift() {
		sweetGift.addAll(Arrays.asList(chocolate, chocoCandy, lollipop, waffle));
	}

	public void printInfoGift() throws IOException {
		System.out.println("New Year Gift: ");
		for (AbstractCandy s : sweetGift) {
			System.out.println(s.getInfo());
			write("src/output.txt", s.getInfo());
		}
	}

	public void evaluateGiftWeight() throws IllegalStateException {
		if (sweetGift.size() == 0) {
			throw new IllegalStateException("Cannot calculate weight, gift is empty!");
		}
		for (AbstractCandy s : sweetGift) {
			gWeight += s.getWeight();
		}
	}

	public void printGiftWeight() throws IOException {
		System.out.println("Gift weight: " + gWeight + " g" + System.lineSeparator());
		write("src/output.txt", "Gift weight: " + gWeight + " g" + System.lineSeparator());
	}

	public void sortByPrice() throws IOException, EmptyGiftException {
		Collections.sort(sweetGift, new PriceComparator());
		System.out.println("Sorting by price: ");
		for (AbstractCandy s : sweetGift) {
			System.out.println(s.getInfo());
			write("src/output.txt", s.getInfo());
		}
	}

	public void searchByWeight() throws IOException, NotFoundException {
		int candyWeight = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(System.lineSeparator() + "Enter weight of candy:");
		candyWeight = sc.nextInt();
		sc.close();
		System.out.println("Search results: ");
		write("src/output.txt", "Search results: ");

		for (AbstractCandy s : sweetGift) {
			if (candyWeight == s.getWeight()) {
				System.out.println(s.getInfo());
				write("src/output.txt", s.getInfo());
			}
		}
	}
}
