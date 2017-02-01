package com.epam.cdp.java_testng.iryna_ramanets.task1;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	/**
	 * @param size of array
	 * @param min value in array
	 * @param max value in array
	 * @return array of random integers  
	 */
	public static List<Integer> generateArray(int size, int min, int max) {
		List<Integer> array = new ArrayList<Integer>(size);
		for(int i = 0; i < size; i++) {
			array.add(min + (int) (Math.random() * (max - min) + 1));
		}
		return array;
	}
	
	public static void main(String[] args) {
		List<Integer> array = generateArray(20, -10, 10);
		for(int i = 0; i < array.size(); i ++) {
			System.out.print(array.get(i) + "[" + i + "] ");
		}
		System.out.println();

		IntArrayHandler handler = new IntArrayHandler(array);
		List<Integer> result = handler.findMultiElementsWithOddIndex();
		for(int el : result) {
			System.out.print(el);
			System.out.print(" ");
		}
		System.out.println();
	}
}
