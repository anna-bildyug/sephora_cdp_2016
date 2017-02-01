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
	
	private List<Integer> arr;

	public IntArrayHandler(List<Integer> arr) {
		this.arr = arr;
	}

	/**
	 * Find elements that occur more than once and have odd index
	 * @param arr input array
	 * @return list of element or null if input null
	 */
	public List<Integer> findMultiElementsWithOddIndex() {
		if(arr == null) return null;
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 1; i < arr.size(); i = i + 2) {
			if(arr.indexOf(arr.get(i)) != arr.lastIndexOf(arr.get(i))) {
				result.add(arr.get(i));
			}
		}
		return result;
	}
}
