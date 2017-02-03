package com.epam.cdp.java_testng.iryna_ramanets.task1;

import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		int[] array = ArrayFactory.generateArray(20, -10, 10);
		System.out.println(Arrays.toString(array));

		List<Integer> result = IntArrayHandler.findMultiElementsWithOddIndex(array);
		System.out.println(Arrays.toString(result.toArray()));
	}
}
