package com.epam.cdp.volha_ivanova.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class PerformanceArrayLinkedLists {
	/**
	 * @author Volha_Ivanova Methods for determining time for add, get and
	 *         remove object in ArrayList and LinkedList
	 * @param MAX
	 *            Maximum value of elements in the collection
	 */
	public static void performanceAddArrayLinkedLists(int MAX) {
		long addTimeArrayList = 0;
		long addTimeLinkedList = 0;
		addTimeArrayList = System.nanoTime();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			arrayList.add(nextInt);
		}
		addTimeArrayList = System.nanoTime() - addTimeArrayList;
		System.out.println("ArrayList adding time = " + addTimeArrayList);
		addTimeLinkedList = System.nanoTime();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			linkedList.add(nextInt);
		}
		addTimeLinkedList = System.nanoTime() - addTimeLinkedList;
		System.out.println("LinkedList adding time = " + addTimeLinkedList);
		if (addTimeArrayList > addTimeLinkedList) {
			System.out.println("Adding to ArrayList takes more time");
		} else {
			System.out.println("Adding to LinkedList takes more time");
		}
	}

	public static void performanceGetArrayLinkedLists(int MAX) {
		long getTimeArrayList = 0;
		long getTimeLinkedList = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			arrayList.add(nextInt);
		}
		getTimeArrayList = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			arrayList.get(i);
		}
		getTimeArrayList = System.nanoTime() - getTimeArrayList;
		System.out.println("ArrayList getting time = " + getTimeArrayList);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			linkedList.add(nextInt);
		}
		getTimeLinkedList = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			linkedList.get(i);
		}
		getTimeLinkedList = System.nanoTime() - getTimeLinkedList;
		System.out.println("LinkedList getting time = " + getTimeLinkedList);
		if (getTimeArrayList > getTimeLinkedList) {
			System.out.println("Getting for ArrayList takes more time");
		} else {
			System.out.println("Getting for LinkedList takes more time");
		}
	}

	public static void performanceRemoveArrayLinkedLists(int MAX) {
		long removeTimeArrayList = 0;
		long removeTimeLinkedList = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			arrayList.add(nextInt);
		}
		removeTimeArrayList = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			arrayList.remove(0);
		}
		removeTimeArrayList = System.nanoTime() - removeTimeArrayList;
		System.out.println("ArrayList removing time = " + removeTimeArrayList);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < MAX; i++) {
			Integer nextInt = new Random().nextInt();
			linkedList.add(nextInt);
		}
		removeTimeLinkedList = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			linkedList.remove(0);
		}
		removeTimeLinkedList = System.nanoTime() - removeTimeLinkedList;
		System.out.println("LinkedList removing time = " + removeTimeLinkedList);
		if (removeTimeArrayList > removeTimeLinkedList) {
			System.out.println("Removing for ArrayList takes more time");
		} else {
			System.out.println("Removing for LinkedList takes more time");
		}
	}
}
