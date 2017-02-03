package com.epam.cdp.java_testng.iryna_ramanets.task1;

public class ArrayFactory {

	/**
	 * @param size of array
	 * @param min value in array
	 * @param max value in array
	 * @return array of random integers  
	 */
	public static int[] generateArray(int size, int min, int max) {
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = min + (int) (Math.random() * (max - min) + 1);
		}
		return array;
	}
}
