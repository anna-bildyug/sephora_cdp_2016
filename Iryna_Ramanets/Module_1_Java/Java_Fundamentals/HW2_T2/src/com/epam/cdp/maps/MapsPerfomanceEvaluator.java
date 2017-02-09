package com.epam.cdp.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class MapsPerfomanceEvaluator {

	public static final int SIZE = 700000;

	public static void main(String[] args) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		Random random = new Random();
		for (int i = 0; i < SIZE; i++) {
			int nextInt = random.nextInt();
			hashMap.put(i, nextInt);
			treeMap.put(i, nextInt);
		}
		
		int nextInt = random.nextInt();
		
		long now = System.nanoTime();
		hashMap.put(SIZE, nextInt);
		System.out.println("Add to Hash Map: " + (System.nanoTime() - now));
		
		now = System.nanoTime();
		treeMap.put(SIZE, nextInt);
		System.out.println("Add to Tree Map: " + (System.nanoTime() - now));

		now = System.nanoTime();
		hashMap.containsKey(SIZE);
		System.out.println("Search Hash Map by key: " + (System.nanoTime() - now));

		now = System.nanoTime();
		treeMap.containsKey(SIZE);
		System.out.println("Search Tree Map by key: " + (System.nanoTime() - now));
		
		now = System.nanoTime();
		hashMap.containsValue(nextInt);
		System.out.println("Search Hash Map by value: " + (System.nanoTime() - now));
		
		now = System.nanoTime();
		treeMap.containsValue(nextInt);
		System.out.println("Search Tree Map by value: " + (System.nanoTime() - now));

		now = System.nanoTime();
		hashMap.remove(SIZE);
		System.out.println("Delete from Hash Map: " + (System.nanoTime() - now));		

		now = System.nanoTime();
		treeMap.remove(SIZE);
		System.out.println("Delete from Tree Map: " + (System.nanoTime() - now));		
	}
}
