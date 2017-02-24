package com.epam.cdp.volha_ivanova.task3;

import java.util.Scanner;

public class Runner {                                       //Volha Ivanova
	
  public static void main(String[] args) {
    boolean isRepeat = true;

    while (isRepeat) {                                      //Printing user menu
      System.out.println("Please, enter number of menu:");
      System.out.println("1 - Summation");
      System.out.println("2 - Subtraction");
      System.out.println("3 - Multiplication");
      System.out.println("4 - Division");
      System.out.println("0 - Exit");
      Scanner scanner = new Scanner(System.in);
      
      int action = scanner.nextInt();
      int enteredValue1;
      int enteredValue2;
      
          
      switch (action) {                                     //Calling method according to user action
      case 0:
        isRepeat = false;
        System.out.println("Completed");
        break;
        
      case 1:
        System.out.println("Please, enter two digits: ");  //Calling method sum
        enteredValue1 = scanner.nextInt();
        enteredValue2 = scanner.nextInt();
        Calculator calc1 = new Calculator(enteredValue1, enteredValue2);
        System.out.println("Sum = " + calc1.sum());
        break;
        
      case 2:
    	System.out.println("Please, enter two digits: ");  //Calling method sub
        enteredValue1 = scanner.nextInt();
        enteredValue2 = scanner.nextInt();
        Calculator calc2 = new Calculator(enteredValue1, enteredValue2);
        System.out.println("Sub = " + calc2.sub());
        break;
        
      case 3:
      	System.out.println("Please, enter two digits: ");  //Calling method mult
        enteredValue1 = scanner.nextInt();
        enteredValue2 = scanner.nextInt();
        Calculator calc3 = new Calculator(enteredValue1, enteredValue2);
        System.out.println("Mult = " + calc3.mult());
        break;
          
      case 4:
      	System.out.println("Please, enter two digits: ");  //Calling method div
        enteredValue1 = scanner.nextInt();
        enteredValue2 = scanner.nextInt();
        Calculator calc4 = new Calculator(enteredValue1, enteredValue2);
        System.out.println("Div = " + calc4.div());
        break;
        
      default:
        System.out.println("Incorrect value! Please, try again.");
        break;
      }
    }
  }
}
