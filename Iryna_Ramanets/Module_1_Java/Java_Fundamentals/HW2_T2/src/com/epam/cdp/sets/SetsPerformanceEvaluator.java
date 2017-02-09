package com.epam.cdp.sets;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetsPerformanceEvaluator {

	public static final int SIZE = 700000;

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		Random random = new Random();
		for (int i = 0; i < SIZE; i++) {
			int nextInt = random.nextInt();
			hashSet.add(nextInt);
			treeSet.add(nextInt);
		}

		int nextInt = random.nextInt();

		long now = System.nanoTime();
		hashSet.add(nextInt);
		System.out.println("Add to Hash Set: " + (System.nanoTime() - now));

		now = System.nanoTime();
		treeSet.add(nextInt);
		System.out.println("Add to Tree Set: " + (System.nanoTime() - now));

		now = System.nanoTime();
		hashSet.contains(nextInt);
		System.out.println("Search in Hash Set: " + (System.nanoTime() - now));

		now = System.nanoTime();
		treeSet.contains(nextInt);
		System.out.println("Search in Tree Set: " + (System.nanoTime() - now));

		now = System.nanoTime();
		hashSet.remove(nextInt);
		System.out.println("Delete from Hash Set: " + (System.nanoTime() - now));

		now = System.nanoTime();
		treeSet.remove(nextInt);
		System.out.println("Delete from Tree Set: " + (System.nanoTime() - now));
	}
}
