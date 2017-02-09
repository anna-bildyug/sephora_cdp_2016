package com.epam.cdp.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListsPerformanceEvaluator {

	public static final int SIZE = 700000;

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		Random random = new Random();
		for (int i = 0; i < SIZE; i++) {
			int nextInt = random.nextInt();
			arrayList.add(nextInt);
			linkedList.add(nextInt);
		}

		int nextInt1 = random.nextInt();
		int nextInt2 = random.nextInt();
		int nextInt3 = random.nextInt();

		long now = System.nanoTime();
		arrayList.add(arrayList.size() / 2, nextInt1);
		System.out.println("Add to the middle of Array List:  "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		linkedList.add(linkedList.size() / 2, nextInt1);
		System.out.println("Add to the middle of Linked List: "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		arrayList.add(0, nextInt2);
		System.out.println("Add to the begining of Array List:  "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		linkedList.add(0, nextInt2);
		System.out.println("Add to the begining of Linked List: "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		arrayList.add(nextInt3);
		System.out.println("Add to the end of Array List:  "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		linkedList.add(nextInt3);
		System.out.println("Add to the end of Linked List: "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		arrayList.indexOf(nextInt3);
		System.out.println("Search in Array List:  "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		linkedList.indexOf(nextInt3);
		System.out.println("Search in Linked List: "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		arrayList.remove(arrayList.size() / 2);
		System.out.println("Delete from the middle of Array List:  "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		linkedList.remove(linkedList.size() / 2);
		System.out.println("Delete from the middle of Linked List: "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		arrayList.remove(0);
		System.out.println("Delete from the beginning of Array List:  "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		linkedList.remove(0);
		System.out.println("Delete from the beginning of Linked List: "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		arrayList.remove(arrayList.size() - 1);
		System.out.println("Delete from the end of Array List:  "
				+ (System.nanoTime() - now));

		now = System.nanoTime();
		linkedList.remove(linkedList.size() - 1);
		System.out.println("Delete from the end of Linked List: "
				+ (System.nanoTime() - now));
	}
}
