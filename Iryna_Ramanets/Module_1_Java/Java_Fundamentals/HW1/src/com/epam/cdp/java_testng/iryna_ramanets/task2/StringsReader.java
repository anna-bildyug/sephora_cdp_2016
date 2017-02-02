package com.epam.cdp.java_testng.iryna_ramanets.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringsReader {
	
	private static final String EPMTY_INPUT = "";  

	/**
	 * Reads strings from System.in stream until input is not empty.
	 * @return list of strings
	 */
	public static List<String> readStrings() {
		List<String> strArray = new ArrayList<String>();
		
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter string" + (strArray.size() + 1) + " or empty to exit input: ");
            String input = scanner.nextLine();

            if (EPMTY_INPUT.equals(input)) {
                System.out.println();
                scanner.close();
                break;
            }
            
            strArray.add(input);
        }
        
        return strArray;
	}
}
