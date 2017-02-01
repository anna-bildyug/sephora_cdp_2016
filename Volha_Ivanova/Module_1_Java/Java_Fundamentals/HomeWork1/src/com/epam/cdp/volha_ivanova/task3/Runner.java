package com.epam.cdp.volha_ivanova.task3;

import java.util.Scanner;

public class Runner {
	/**
	 * @author Volha_Ivanova 
	 * Input : N strings are entered from console 
	 * Output: Find the longest and the shortest string and they length
	 */

	public static void main(String[] args) {
		boolean isRepeat = true;

		while (isRepeat) {
			System.out.println("Please, enter number of menu:");
			System.out.println("1 - Summation");
			System.out.println("2 - Subtraction");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("0 - Exit");
			Scanner scanner = new Scanner(System.in);

			int action = scanner.nextInt();
			int firstEnteredValue;
			int secondEnteredValue;

			if (action == 0) {
				System.out.println("Completed");
				isRepeat = false;
			} else {
				if (action > 4) {
					System.out.println("Incorrect value! Please, try again.");
				} else {
					System.out.println("Please, enter two digits: ");
					firstEnteredValue = scanner.nextInt();
					secondEnteredValue = scanner.nextInt();
					Calculator calc = new Calculator();

					switch (action) {

					case 1:
						System.out.println("Sum = " + calc.sum(firstEnteredValue, secondEnteredValue));
						break;

					case 2:
						System.out.println("Sub = " + calc.sub(firstEnteredValue, secondEnteredValue));
						break;

					case 3:
						System.out.println("Mult = " + calc.mult(firstEnteredValue, secondEnteredValue));
						break;

					case 4:
						if (secondEnteredValue == 0) {
							System.out.println("Division by 0 is not allowed");
						} else {
							System.out.println("Div = " + calc.div(firstEnteredValue, secondEnteredValue));
							break;
						}
					}
				}
			}
		}
	}
}
