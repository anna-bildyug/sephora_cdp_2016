package com.epam.cdp.volha_ivanova.task1;

public class Runner {
	/**
	 * @author Volha_Ivanova 
	 * Input : array of integers from -10 to 10; 
	 * Output: Sum of elements that have event index
	 * @param min Min value of array of integers
	 * @param max Max value of array of integers
	 */

	private static int[] array = new int[20];

	public static void main(String[] args) {

		System.out.println("Array elements: \n");
		createArray(-10, 10);
		printArray();
		calculateSum();

	}

	private static void createArray(int min, int max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (max - min) + min);
		}
	}

	private static void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void calculateSum() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				sum += array[i];
			}
		}
		System.out.println("Sum of the elements that have event index = " + sum);
	}

}
