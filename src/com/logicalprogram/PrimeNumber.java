package com.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Value Of Perfect Number ");
	int Number=sc.nextInt();; 
		int Division_Number=1; 
		int Value=1;
		
while (Division_Number <= Number) {
	Division_Number++;
	
		if (Number%Division_Number==0)
			Value=Value*Division_Number;		 
	}
     if (Value-Number == 0) 
    	 System.out.println("THE NUMBER  "+  Number  +"  IS THE PRIME NUMBER");
      else
       System.out.println("THE NUMBER  "+  Number  +"  IS THE NON PRIME NUMBER");
     }
}

