package com.epam.cdp.java_testng.iryna_ramanets.task2;

import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		List<String> strings = StringsReader.readStrings();
        
		System.out.println("Result: " + StringsHandler.getStringWithLessDuplicateChars(strings));
	}

}
