package com.epam.cdp.volha_ivanova.task1.sweets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.epam.cdp.volha_ivanova.task1.sweets.candies.chocolateCandies.ChocolateCandies;
import com.epam.cdp.volha_ivanova.task1.sweets.candies.lollipop.Lollipop;
import com.epam.cdp.volha_ivanova.task1.sweets.chocolate.Chocolate;
import com.epam.cdp.volha_ivanova.task1.sweets.waffles.Waffles;

public class Gift {	
	
	int giftWeight;			
	Scanner scanner = new Scanner(System.in);
	Waffles waffle = new Waffles("Waffles", 10, scanner.nextInt());	
	Chocolate chocolate1 = new Chocolate("White chocolate", "white", 100, scanner.nextInt());	
	Chocolate chocolate2 = new Chocolate("Dark chocolate", "dark", 100, scanner.nextInt());	
	Chocolate chocolate3 = new Chocolate("Milk chocolate", "Milk", 100, scanner.nextInt());	
	ChocolateCandies chocoCandy = new ChocolateCandies("Chocolate candies", 30, scanner.nextInt());	
	Lollipop lollipop = new Lollipop("Lollipop", 20, scanner.nextInt());				
	
	public void evaluateGiftWeight() {		
		giftWeight = waffle.getWaffleCount()*waffle.getWeight() + chocolate1.getChocolateCount()*chocolate1.getWeight() + chocolate2.getChocolateCount()*chocolate2.getWeight()+chocolate3.getChocolateCount()*chocolate3.getWeight() + chocoCandy.getChocoCandiesCount()*chocoCandy.getWeight()+ lollipop.getLollipopCount()*lollipop.getWeight();
		System.out.println("Weight of the present is " + giftWeight + " gramm");
	}
	public void sortCandies() {
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
	}
	public void findCandy() {
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
