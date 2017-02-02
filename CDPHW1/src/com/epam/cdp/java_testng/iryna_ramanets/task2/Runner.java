package com.epam.cdp.java_testng.iryna_ramanets.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
	
	/**
	 * @return list of strings
	 */
	public static List<String> getStrings() {
		List<String> strArray = new ArrayList<String>();
		
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter something or empty to exit input: ");
            String input = scanner.nextLine();

            if ("".equals(input)) {
                System.out.println();
                scanner.close();
                break;
            }
            
            strArray.add(input);
        }
        
        return strArray;
	}

	public static void main(String[] args) {
		List<String> strings = getStrings();
        
		StringsHandler handler = new StringsHandler(strings);
		System.out.println("Result: " + handler.getStringWithLessDuplicateChars());
	}

}
