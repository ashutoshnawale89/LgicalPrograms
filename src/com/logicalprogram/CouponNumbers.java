package com.logicalprogram;

public class CouponNumbers {
	public static void main(String[] args) 
	{
		long arr[]=new long[5];
		int num=0;
		for (int i=0; i < arr.length; i++)
		num=(int)(Math.random()*1000000000);
		      for (int j=0; j <= i; j++)
		arr[i]=num;
		System.out.println("LOTTERY NUMBER IS   "+"000"+num+"");	
	}
}