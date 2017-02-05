package com.epam.cdp.volha_ivanova.task2;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class PerformanceHashTreeMaps {
	/**
	 * @author Volha_Ivanova Methods for determining time for add, get and
	 *         remove object in HashMap and TreeMap
	 * @param MAX
	 *            Maximum value of elements in the collection
	 */
	public static void performanceAddHashTreeMaps(int MAX) {
		long addTimeHashMap = 0;
		long addTimeTreeMap = 0;
		addTimeHashMap = System.nanoTime();
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			hmap.put(i, nextInt);
		}
		addTimeHashMap = System.nanoTime() - addTimeHashMap;
		System.out.println("HashMap adding time = " + addTimeHashMap);
		addTimeTreeMap = System.nanoTime();
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			tmap.put(i, nextInt);
		}
		addTimeTreeMap = System.nanoTime() - addTimeTreeMap;
		System.out.println("TreeMap adding time = " + addTimeTreeMap);
		if (addTimeHashMap > addTimeTreeMap) {
			System.out.println("Adding to HashMap takes more time");
		} else {
			System.out.println("Adding to TreeMap takes more time");
		}
	}

	public static void performanceGetHashTreeMaps(int MAX) {
		long getTimeHashMap = 0;
		long getTimeTreeMap = 0;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			hmap.put(i, nextInt);
		}
		getTimeHashMap = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			hmap.get(i);
		}
		getTimeHashMap = System.nanoTime() - getTimeHashMap;
		System.out.println("HashMap getting time = " + getTimeHashMap);
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			tmap.put(i, nextInt);
		}
		getTimeTreeMap = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			tmap.get(i);
		}
		getTimeTreeMap = System.nanoTime() - getTimeTreeMap;
		System.out.println("TreeMap getting time = " + getTimeTreeMap);
		if (getTimeHashMap > getTimeTreeMap) {
			System.out.println("Getting for HashMap takes more time");
		} else {
			System.out.println("Getting for TreeMap takes more time");
		}
	}

	public static void performanceRemoveHashTreeMaps(int MAX) {
		long removeTimeHashMap = 0;
		long removeTimeTreeMap = 0;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			hmap.put(i, nextInt);
		}
		removeTimeHashMap = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			hmap.remove(i);
		}
		removeTimeHashMap = System.nanoTime() - removeTimeHashMap;
		System.out.println("HashMap removing time = " + removeTimeHashMap);
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			tmap.put(i, nextInt);
		}
		removeTimeTreeMap = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			tmap.remove(i);
		}
		removeTimeTreeMap = System.nanoTime() - removeTimeTreeMap;
		System.out.println("TreeMap removing time = " + removeTimeTreeMap);
		if (removeTimeHashMap > removeTimeTreeMap) {
			System.out.println("Removing for HashMap takes more time");
		} else {
			System.out.println("Removing for TreeMap takes more time");
		}
	}
}
