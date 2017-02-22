package com.epam.cdp.volha_ivanova.task1.runner;

import java.io.IOException;

import com.epam.cdp.volha_ivanova.task1.exceptions.EmptyGiftException;
import com.epam.cdp.volha_ivanova.task1.exceptions.NotFoundException;
import com.epam.cdp.volha_ivanova.task1.gift.Gift;
import com.epam.cdp.volha_ivanova.task1.readWrite.ReadFile;
import com.epam.cdp.volha_ivanova.task1.readWrite.WriteToFile;

public class Runner {
	/**
	 * @autor Volha_Ivanova. Complete gift, evaluate gift weight, sort sweets by
	 *        price, search sweet within entered parameters.
	 */
	public static void main(String[] args) throws IOException, NotFoundException {
		Gift gift = new Gift();
		ReadFile.readCandyFromFile("src/input.txt", gift);
		WriteToFile.writeCandyToFile("src/output.txt", gift);
		gift.printInfoGift();
		gift.evaluateGiftWeight();
		gift.printGiftWeight();
		try {
			gift.sortByPrice();
		} catch (EmptyGiftException e) {
			System.out.println(e.getMessage());
		}
		try {
			gift.searchByWeight();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
