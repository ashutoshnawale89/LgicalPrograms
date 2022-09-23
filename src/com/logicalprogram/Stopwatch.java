package com.logicalprogram;

import java.util.Scanner;

public class Stopwatch {
	public static void main(String [] args) {
		
		Scanner sc =new Scanner(System.in);
	long startTime=0,endTime=0,time=0;
	System.out.println("Enter The Value 1 For START The StopWatch");
	int num1=sc.nextInt();
	if (num1==1) {
	startTime=System.currentTimeMillis();
	}
	System.out.println("Enter The Value 0 For STOP The StopWatch");
	num1=sc.nextInt();
	if (num1==0) {
		endTime=System.currentTimeMillis();
	}
	time=(endTime - startTime)/1000;  // to cvert the Million to sec/min
	System.out.println(" The StopWatch is in Second  :"+time);
	}
	
}
