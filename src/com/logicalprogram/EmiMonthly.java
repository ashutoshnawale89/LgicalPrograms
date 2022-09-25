package com.logicalprogram;

import java.util.Scanner;

public class EmiMonthly {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Value Of Year");
		double year=sc.nextInt();
		System.out.println("Enter The Value Of Principle Amount");
		double princLoanAmt=sc.nextInt();
		System.out.println("Enter The Value Of Rate of Interest");
		double rateOfIntrst=sc.nextInt();
		
		//  change in Rate of interest 
		rateOfIntrst=rateOfIntrst/100;
		  
		double num1=Math.pow((1+rateOfIntrst),-year);
			
		double value=((princLoanAmt*rateOfIntrst)/(1-num1));
		System.out.println("Total Value Paid in 1 year is : "+value);
		value=value/(12);
		System.out.println("The Monthly EMI is : "+value);
	}
}
