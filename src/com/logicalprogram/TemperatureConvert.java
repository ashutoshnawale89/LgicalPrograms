package com.logicalprogram;

import java.util.Scanner;

public class TemperatureConvert {

	public static void main(String [] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 for Celsius to Fahrenheit Coversion ");
		System.out.println("Enter 2 for Fahrenheit to Celsius Coversion ");
		int num=sc.nextInt();
			switch (num) {
			case 1: System.out.println("Enter The Value in Celsius ");
				int temp=sc.nextInt();
				temp=(temp * (9/5)) + 32 ;
				System.out.println("The Value In Fahrenheit is  :"+temp);
				break;
			case 2:  System.out.println("Enter The Value in Fahrenheit ");
			int temp1=sc.nextInt();
			temp1=(temp1 -32) * (5/9) ;
			System.out.println("The Value In Celsius is  :"+temp1);
			break;	
			default : System.out.println("choice is outof Bound");
			
			}
	}
	}
