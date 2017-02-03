package com.epam.cdp.volha_ivanova.task2;

import java.util.Scanner;

public class Runner {
	/**
	 * @author Volha_Ivanova 
	 * Input : N strings are entered from console 
	 * Output: Find the longest and the shortest string and they length
	 */

	private static int n;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		
		System.out.println("Enter number of strings!");
		int numberOfStrings = scanner.nextInt();
		String names[] = new String[numberOfStrings];
		System.out.println("Enter " + numberOfStrings + " strings!");

		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.next();
		}

		int maxLength = 0;
		String longestString = null;
		String shortestString = "";
		int minLength = Integer.MAX_VALUE;

		for (String str : names) {
			if (str.length() > maxLength) {
				maxLength = str.length();
				longestString = str;
			}

			if (str.length() < minLength) {
				minLength = str.length();
				shortestString = str;
			}

		}
		System.out.println("The longest string is " + "'" + longestString + "'." + " Length=" + longestString.length());
		System.out.println(
				"The shortest string is " + "'" + shortestString + "'." + " Length=" + shortestString.length());
	}
}
