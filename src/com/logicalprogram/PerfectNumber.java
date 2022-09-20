package com.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of Perfect Number ");
		int Number=sc.nextInt();;  
		
		int TotalCount=0,count=0;
		
		while (count <= Number) {
			count++;
			if (Number%count==0)  {
				TotalCount= TotalCount + count;	
		}
			}
	//   NEW 
		int sum=TotalCount-(2*Number);
		if (sum == 0)
			System.out.println("########   THE VALUE IS PERFECT NUMBER   #######");  
		else 
			System.out.println("######   THE VALUE IS NOT PERFECT NUMBER  #######");
}
}