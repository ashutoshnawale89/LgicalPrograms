package com.logicalprogram;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Amount ");
		int amount=sc.nextInt();
		int arr[]= {1,2,5,10,20,50,100,200,500,1000};
		int i=arr.length-1;
		while(amount > 0) {
			int count=0;
			while ( amount >= arr[i]) {
				amount=amount-arr[i];
			count++;
			}
			if (count!=0)
			System.out.println(" The Note of  "+arr[i]+"  X  "+count);
			i--;
		}
	}
	
}
