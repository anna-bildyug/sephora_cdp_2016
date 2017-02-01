package com.epam.cdp.java_testng.iryna_ramanets.task3;

public class Calculator {

	private Float memory;

	/**
	 * @return sum of two integers
	 */
	public int sum(int a, int b) {
		memory = new Float(a + b);
		return memory.intValue();
	}

	/**
	 * @return subtraction of two integers
	 */
	public int sub(int a, int b) {
		memory = new Float(a - b);
		return memory.intValue();
	}

	/**
	 * @return multiplication of two integers
	 */
	public int mult(int a, int b) {
		memory = new Float(a * b);
		return memory.intValue();
	}

	/**
	 * @return division of two integers or null in case division by 0
	 */
	public Float div(int a, int b) {
		if(b == 0) {
			System.out.println("Division by zero is not allowed.");
			memory = null;
		} else {
			memory = new Float(((float) a) / b);			
		}
		return memory;
	}

	/**
	 * @return previous result stored in memory
	 */
	public Float getMemory() {
		return memory;
	}
}
