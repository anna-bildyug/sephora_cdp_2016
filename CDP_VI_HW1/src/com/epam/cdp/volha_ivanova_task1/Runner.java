package com.epam.cdp.volha_ivanova_task1;

public class Runner {                       //Volha Ivanova. В массиве целых чисел определить сумму элементов, состоящих на чётных позициях

	int [] arr1;
			
	public static void main(String[] args) {
    int [] arr1 = new int [20];             // declare massive and its length
    int min = -10;
    int max = 10;
    int j = min;
    
   System.out.println("Array elements: \n");
   
    for (int i=0; i<arr1.length; i++) {     // filling massive
    	while (j <= max) { 
    		if (j!=0) {
    	arr1[i] = j;
    	j++;
    System.out.println(arr1[i]);
    	}  	else {j++;}
    }
    }
    
    int sum = 0;
    for (int i=0; i<arr1.length; i++) {     //Find the sum of element on the even positions
    	if ( (i+1)%2 == 0) {
    		sum += arr1[i]; 
    	}  
    }
    System.out.println("Sum of the elements on the even positions = "+sum);
}
}
	
	
