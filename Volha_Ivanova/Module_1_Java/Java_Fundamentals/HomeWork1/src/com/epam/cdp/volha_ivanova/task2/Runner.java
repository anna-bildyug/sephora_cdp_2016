package com.epam.cdp.volha_ivanova.task2;

import java.util.Scanner;

public class Runner {                                  //VolhaIvanova. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину

	public static void main(String[] args) {
		
		String names[] = new String[5];                //Declare string array
		Scanner scanner = new Scanner(System.in);      
		System.out.println("Enter 5 strings!");
		
		for (int i=0; i<names.length; i++) {           //Enter 5 string from the console
		names[i] = scanner.next();
		}		
			
		int maxLength = 0;
        String longestString = null;
        for (String l : names) {                      //Find the longest string
            if (l.length() > maxLength) {
                maxLength = l.length();
                longestString = l;
            }
        }		
       	System.out.println("The longest string is "+"'"+longestString+"'."+" Length="+longestString.length());
	 
       	int minLength = longestString.length();
        String shortestString = null;
        for (String s : names) {                      //Find the shortest string
            if (s.length() < minLength) {
                minLength = s.length();
                shortestString = s;
            }
        }		
        System.out.println("The shortest string is "+"'"+shortestString+"'."+" Length="+shortestString.length());
	}
}
