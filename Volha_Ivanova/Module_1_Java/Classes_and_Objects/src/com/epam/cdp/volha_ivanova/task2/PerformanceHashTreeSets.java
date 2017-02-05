package com.epam.cdp.volha_ivanova.task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class PerformanceHashTreeSets {
	/**
	 * @author Volha_Ivanova Methods for determining time for add, get and
	 *         remove object in HashSet and TreeSet
	 * @param MAX
	 *            Maximum value of elements in the collection
	 */
	public static void performanceAddAHashTreeSets(int MAX) {
		long addTimeHashSet = 0;
		long addTimeTreeSet = 0;
		addTimeHashSet = System.nanoTime();
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			hset.add(nextInt);
		}
		addTimeHashSet = System.nanoTime() - addTimeHashSet;
		System.out.println("HashSet adding time = " + addTimeHashSet);
		addTimeTreeSet = System.nanoTime();
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			tset.add(nextInt);
		}
		addTimeTreeSet = System.nanoTime() - addTimeTreeSet;
		System.out.println("TreeSet adding time = " + addTimeTreeSet);
		if (addTimeHashSet > addTimeTreeSet) {
			System.out.println("Adding to HashSet takes more time");
		} else {
			System.out.println("Adding to TreeSet takes more time");
		}
	}

	public static void performanceGetHashTreeSets(int MAX) {
		long getTimeHashSet = 0;
		long getTimeTreeSet = 0;
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			hset.add(nextInt);
		}
		Iterator<Integer> hs = hset.iterator();
		getTimeHashSet = System.nanoTime();
		while (hs.hasNext()) {
			hs.next();
		}
		getTimeHashSet = System.nanoTime() - getTimeHashSet;
		System.out.println("HashSet getting time = " + getTimeHashSet);
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			tset.add(nextInt);
		}
		getTimeTreeSet = System.nanoTime();
		Iterator<Integer> ts = hset.iterator();
		getTimeHashSet = System.nanoTime();
		while (ts.hasNext()) {
			ts.next();
		}
		getTimeTreeSet = System.nanoTime() - getTimeTreeSet;
		System.out.println("TreeSet getting time = " + getTimeTreeSet);
		if (getTimeHashSet > getTimeTreeSet) {
			System.out.println("Getting for HashSet takes more time");
		} else {
			System.out.println("Getting for TreeSet takes more time");
		}
	}

	public static void performanceRemoveHashTreeSets(int MAX) {
		long removeTimeHashSet = 0;
		long removeTimeTreeSet = 0;
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			hset.add(nextInt);
		}
		removeTimeHashSet = System.nanoTime();
		for (Iterator<Integer> hs = hset.iterator(); hs.hasNext();) {
			Integer element = hs.next();
			hs.remove();
		}
		removeTimeHashSet = System.nanoTime() - removeTimeHashSet;
		System.out.println("HashSet removing time = " + removeTimeHashSet);
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			tset.add(nextInt);
		}
		removeTimeTreeSet = System.nanoTime();
		for (Iterator<Integer> ts = tset.iterator(); ts.hasNext();) {
			Integer element = ts.next();
			ts.remove();
		}
		removeTimeTreeSet = System.nanoTime() - removeTimeTreeSet;
		System.out.println("TreeSet removing time = " + removeTimeTreeSet);
		if (removeTimeHashSet > removeTimeTreeSet) {
			System.out.println("Removing for HashSet takes more time");
		} else {
			System.out.println("Removing for TreeSet takes more time");
		}
	}
}
