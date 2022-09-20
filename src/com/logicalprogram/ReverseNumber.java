package com.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of Perfect Number "); 
		int i=sc.nextInt();  // PUT THE NUMBER
		int reverse=0,remainder=0;
		int temp=i;
		while (temp != 0) { 
			remainder=temp%10;
			reverse=(reverse*10)+ remainder;
			temp=temp/10;
		}
		if (i==reverse)  {
			System.out.println("THE NUMBER IS REVERSE or PALINDROME = " + reverse );
		} else   {
			System.out.println("THE NUMBER IS REVERSE or NOT-PALINDROME = " + reverse );
		}


	}
}
