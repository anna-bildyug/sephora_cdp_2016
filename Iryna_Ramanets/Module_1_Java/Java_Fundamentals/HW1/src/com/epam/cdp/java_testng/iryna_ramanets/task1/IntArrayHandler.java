/**
 * 
 */
package com.epam.cdp.java_testng.iryna_ramanets.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to perform operations with arrays of integers
 */
public class IntArrayHandler {
	
	/**
	 * Find elements that occur more than once and have odd index
	 * @param arr input array
	 * @return list of element or null if input null
	 */
	public static List<Integer> findMultiElementsWithOddIndex(int[] arr) {
		if(arr == null) return null;
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 1; i < arr.length; i = i + 2) {
			for(int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					result.add(arr[i]);
					break;
				}				
			}
		}
		return result;
	}
}
