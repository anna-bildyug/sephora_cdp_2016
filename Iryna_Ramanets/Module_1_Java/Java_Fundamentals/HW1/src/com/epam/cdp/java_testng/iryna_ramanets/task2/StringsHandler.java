/**
 * 
 */
package com.epam.cdp.java_testng.iryna_ramanets.task2;

import java.util.List;

/**
 * Class to perform operations with arrays of strings
 */
public class StringsHandler {
	
	/**
	 * Find elements with less duplicated characters
	 * @param arr 
	 * @param arr input array
	 * @return list of element or null if input null
	 */
	public static String getStringWithLessDuplicateChars(List<String> arr) {
		String result = null;
		
		if(arr != null) {
			int min = Integer.MAX_VALUE;
			for(String str : arr) {
				int maxCh = 0;
				
				for(int i = 0; i < str.length(); i++) {
					int count = 0;
					char ch = str.charAt(i);
					
					for(int j = 0; j < str.length(); j++) {
						if(ch == str.charAt(j)) {
							count++;
						}
					}
					
					if(count > maxCh) {
						maxCh = count;
					}
				}
				
				if(maxCh < min) {
					result = str;
					min = maxCh;
				}
			}
		}
		return result;
	}

}
