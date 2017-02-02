package com.epam.cdp.java_testng.iryna_ramanets.task3;

import java.util.Scanner;

public class Runner {

	private static final String EXIT_INPUT = "q";
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Enter first value or q to exit: ");
			String value1 = scanner.nextLine();
	        if(EXIT_INPUT.equals(value1)) {
	        	break;
	        }

	        System.out.print("Enter first value or q to exit: ");
			String value2 = scanner.nextLine();
	        if(EXIT_INPUT.equals(value2)) {
	        	break;
	        }

	        System.out.print("Enter first value or q to exit: ");
			String operation = scanner.nextLine();
	        if(EXIT_INPUT.equals(operation)) {
	        	break;
	        }
	        
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
    	scanner.close();
	}

}
