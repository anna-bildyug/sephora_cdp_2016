package com.epam.cdp.volha_ivanova.task3;

public class Calculator {
	
	private int value1;
	private int value2;
	
	  public Calculator(int value1, int value2) {
	    this.value1 = value1;
	    this.value2 = value2;	    	    
	  }
	  
	  public int sum() { //Method for Summation
	    int result = 0;
	    result = value1 + value2;
	    return result;
	  }

	  public int sub() { //Method for Subtraction
		 int result = 0;
		 result = value1 - value2;
		 return result;
	  }
	  
	  public int mult() { //Method for Multiplication
		int result = 0;
		result = value1 * value2;
		return result;
	  }
	  
	  public int div() { //Method for Division
		int result = 0;
		result = value1 / value2;
		return result;
	  }

}
