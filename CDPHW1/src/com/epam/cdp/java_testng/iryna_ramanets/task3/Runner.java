package com.epam.cdp.java_testng.iryna_ramanets.task3;

import java.util.Scanner;

public class Runner {

	/**
	 * @param msg to display for input
	 * @return input
	 */
	public static String getInput(String msg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(msg);
        String input = scanner.nextLine();
        
        if("q".equals(input)) {
        	scanner.close();
        	System.exit(0);
        }
        
        return input;
	}

	public static void main(String[] args) {
        Calculator calculator = new Calculator();
		while(true) {
	        String value1 = getInput("Enter first value or q to exit: ");
	        String value2 = getInput("Enter second value or q to exit: ");
	        String operation = getInput("Enter operation (+, -, *, /) or q to exit: ");

	        switch (operation) {
	        case "+":
	        	calculator.sum(Integer.parseInt(value1), Integer.parseInt(value2));
	        	break;
	        case "-":
	        	calculator.sub(Integer.parseInt(value1), Integer.parseInt(value2));
	        	break;
	        case "*":
	        	calculator.mult(Integer.parseInt(value1), Integer.parseInt(value2));
	        	break;
	        case "/":
	        	calculator.div(Integer.parseInt(value1), Integer.parseInt(value2));
	        	break;
	        default:
	        	System.out.println("Please enter correct operation");
	        	continue;
	        }
	        System.out.println("Result = " + calculator.getMemory() + "\n");
		}
	}

}
